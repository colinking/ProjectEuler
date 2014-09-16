/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeuler;

//import java.math.BigInteger;

/**
 *
 * @author colin
 */
public class p2fibonacci {
    
    public static void main(String[] args) {
        long max = 4000000;
        long total = 0;
        long pval = 0;
        long cval = 1;
        // 0, 1, 1, 2, 3, 5, 8
        while(cval < max) {
            cval += pval;
            pval = cval - pval;
            total += (cval % 2 == 0? cval : 0);
        }
        System.out.println(total);
    }
    
}
