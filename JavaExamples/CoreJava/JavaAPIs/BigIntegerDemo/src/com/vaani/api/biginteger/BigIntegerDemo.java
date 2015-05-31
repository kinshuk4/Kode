package com.vaani.api.biginteger;

import java.math.BigInteger;
/*BigInteger is immutable. 
 * Therefore, you can't change sum, 
 * you need to reassign the result of the add method to sum.

sum = sum.add(BigInteger.valueOf(i));
more - http://stackoverflow.com/questions/1783912/java-how-to-use-biginteger
*/
public class BigIntegerDemo {
    public static void main(String[] args) {
        
        BigInteger b1 = new BigInteger("987654321987654321000000000");
        BigInteger b2 = new BigInteger("987654321987654321000000000");
        BigInteger b3 = BigInteger.valueOf(100); 
        
        BigInteger product = b1.multiply(b2);
        BigInteger division = b1.divide(b2);
        
        System.out.println("product = " + product);
        System.out.println("division = " + division);  // prints 1
    
    }
}
