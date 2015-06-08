package org.effectivejava.examples.chapter02.item07.finalizerchaining;

/**
 * Created by kchandra on 08/06/15.
 */
public class Child extends Parent {
    // Manual finalizer chaining
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("DD"); // Finalize subclass state
        } finally {
            super.finalize();
        }
    }
}
