package com.vaani.lucene.demo;

import org.apache.lucene.queryParser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    // location where the index will be stored.
    private static final String INDEX_DIR = "src/main/resources/index";
    private static final int DEFAULT_RESULT_SIZE = 100;

    public static void main(String[] args) throws IOException, ParseException {

        // the items to be indexed
        IndexItem[] indexItems = {
                new IndexItem(1L, "Java in Action", "This is Java in Action Book"),
                new IndexItem(2L, "Spring in Action", "This is Spring in Action Book"),
                new IndexItem(3L, "Hibernate in Action", "This is Hibernate in Action Book"),
                new IndexItem(4L, "SOA in Action", "This is SOA in Action Book"),
                new IndexItem(5L, "Apache Axis2 in Action", "This is Axis2 in Action Book"),
                new IndexItem(6L, "Apache CXF in Action", "This is CXF in Action Book"),
                new IndexItem(7L, "jQuery in Action", "This is jQuery in Action Book")};

        // creating the indexer and indexing the items
        Indexer indexer = new Indexer(INDEX_DIR);
        for (IndexItem indexItem : indexItems) {
            indexer.index(indexItem);
        }
        // close the index to enable them index
        indexer.close();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        System.out.println("Type Q/q to quit.");
        System.out.println("Type 1 query by title.");
        System.out.println("Type 2 query by content.");

        // creating the Searcher to the same index location as the Indexer
        Searcher searcher = new Searcher(INDEX_DIR);

        do {
            System.out.print("Enter input: ");
            input = reader.readLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            // search by title
            if (input.equals("1")) {
                System.out.print("Enter title to search: ");
                input = reader.readLine();
                List<IndexItem> result = searcher.findByTitle(input, DEFAULT_RESULT_SIZE);
                print(result);
            } else if (input.equals("2")) { // else, search by content
                System.out.print("Enter content to search: ");
                input = reader.readLine();
                List<IndexItem> result = searcher.findByContent(input, DEFAULT_RESULT_SIZE);
                print(result);
            }

        } while (true);

        searcher.close();
    }

    /**
      * print the results.
      */
    private static void print(List<IndexItem> result) {
        System.out.println("Result Size: " + result.size());

        for (IndexItem item : result) {
            System.out.println(item);
        }
    }
}
