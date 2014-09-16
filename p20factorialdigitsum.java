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
public class p20factorialdigitsum {

    public static void main(String[] args) {
        BigInteger num = BigInteger.ONE;
        for (int i = 100; i > 0; i--) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        int sum = 0;
        for (int i = 0; i < num.toString().length(); i++) {
            sum += Character.getNumericValue(num.toString().charAt(i));
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
