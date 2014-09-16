/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author colin
 */
public class p3primefactors {

    public static void main(String[] args) {
        BigInteger num = new BigInteger("600851475143");
        BigInteger pcheck = new BigInteger("2");
        ArrayList<BigInteger> divisors = new ArrayList<>();
        while (true) {
            System.out.println(num);
            if (num.remainder(pcheck) == BigInteger.ZERO) {
                //if num is divisible by pcheck
                System.out.print("Divided: " + num + " by ");
                num = num.divide(pcheck);
                System.out.println(pcheck + " to get " + num);
                divisors.add(pcheck);
                if (num == BigInteger.ONE) {
                    System.out.print("num equals 1: ");
                    for (BigInteger v : divisors) {
                        System.out.print(v + ", ");
                    }
                    System.out.println();
                    break;
                }
            } else {
                pcheck = pcheck.add(BigInteger.ONE);
                if (pcheck.compareTo(num.divide(BigInteger.valueOf(2))) > 0) {
                    divisors.add(num);
                    System.out.print("pcheck maxed out: ");
                    for (BigInteger v : divisors) {
                        System.out.print(v + ", ");
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }

}
