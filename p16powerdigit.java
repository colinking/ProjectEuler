/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeuler;

import java.math.BigInteger;

/**
 *
 * @author colin
 */
public class p16powerdigit {
    
    public static void main(String[] args) {
        int exponent = 1000;
        BigInteger two = new BigInteger("2");
        
        String thevalue = two.pow(exponent).toString();
        System.out.println(thevalue);
        
        long sum = 0;
        for(int i = 0; i < thevalue.length(); i++) {
            sum += Character.getNumericValue(thevalue.charAt(i));
        }
        System.out.println(sum);
    }
    
}
