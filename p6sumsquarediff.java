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
public class p6sumsquarediff {
    
    public static void main(String[] args) {
        int max = 100;
        BigInteger sumSquare = BigInteger.ZERO;
        for(int i = 0; i <= max; i++) {
            sumSquare = sumSquare.add(BigInteger.valueOf(i*i));
        }
        System.out.println(sumSquare);
        BigInteger squareSum = BigInteger.ZERO;
        for(int i = 0; i <= max; i++) {
            squareSum = squareSum.add(BigInteger.valueOf(i));
        }
        System.out.println(squareSum);
        squareSum = squareSum.pow(2);
        System.out.println(squareSum);
        System.out.println(sumSquare.subtract(squareSum));
    }
    
}
