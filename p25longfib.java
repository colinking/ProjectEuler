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
public class p25longfib {

    public static void main(String[] args) {
        BigInteger curr = BigInteger.ONE;
        BigInteger prev = BigInteger.ZERO;
        int count = 0;
        while(curr.toString().length() < 3) {
            BigInteger temp = new BigInteger(curr.toString());
            curr = curr.add(prev);
            prev = temp;
            count++;
        }
        System.out.println(curr);
        System.out.println(++count);
    }
}
