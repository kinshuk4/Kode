package org.effectivejava.examples.chapter03.item08;

/**
 * Created by kchandra on 08/06/15.
 */
public class FooNonReflexive {

        int i;
        public boolean equals(Object obj) {
            return ((FooNonReflexive) obj).i < this.i;
        }

}
