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
public class p48selfpowers {
    
    public static void main(String[] args) {
        BigInteger n = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        BigInteger max = new BigInteger("1000");
        while(n.compareTo(max) < 0) {
            sum = sum.add(n.pow(n.intValue()));
            n = n.add(BigInteger.ONE);
        }
        System.out.println(sum);
    }
    
}
