package com.vaani.java.apache;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.math3.stat.descriptive.rank.Percentile;
import org.apache.http.client.ClientProtocolException;

public class AsyncCaller {
	static PrintWriter writer = null;

	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		writer = new PrintWriter(new File("sync.txt"));
		Profiler pro = new Profiler();
		List<Long> list = new LinkedList<Long>();
		for (int i = 0; i < 100; i++) {
			list.add(pro.asyncProfile());

		}
		printPercentile(list);

	}

	public static void printPercentile(List<Long> list) {
		Percentile percentile = new Percentile();
		double[] dList = new double[list.size()];
		int i = 0;
		for (long l : list) {
			dList[i++] = (double) l;
		}

		double[] per = { 10.0, 50.0, 90.0, 95.0, 99.0 };
		for (i = 0; i < per.length; i++) {
			writer.append(per[i] + "th percentile value: "
					+ percentile.evaluate(dList, per[i]));
		}

	}
}
