package org.effectivejava.examples.chapter03.item08;

/**
 * Created by kchandra on 09/06/15.
 */
public class ColorPointTest {
    public static void main(String[] args) {
        Point p1 = new Point(1,0);
        Point p2 = new ColorPoint(1,0, Color.BLUE);

        System.out.println(p1.equals(p2) + " "+ p2.equals(p1));//true  false
    }
}
