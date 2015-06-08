package org.effectivejava.examples.chapter02.item05.extraobjectcreation;

/**
 * Created by kchandra on 08/06/15.
 */
public class StringGen {
    public static void main(String[] args) {
        String s1 = new String("I am unnecessary");

        //This version uses a single String instance
        String s2 = "I am just an instance";

        Boolean b1 = new Boolean("true");//bad
        Boolean b2 = Boolean.valueOf("true");//better
    }
}
