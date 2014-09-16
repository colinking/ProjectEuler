/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

import java.util.ArrayList;

/**
 *
 * @author colin
 */
public class p27quadraticprimes {

    public static void main(String[] args) {
        ArrayList<Integer> bArr = new ArrayList<>();
        for (int i = 2; i < 1000; i++) {
            if (p7primefinder.isPrime(i)) {
                bArr.add(i);
                bArr.add(i * -1);
            }
        }
        int maxA = 0, maxB = 0, maxPrime = 0;
        for (int b : bArr) {
//            System.out.println("Testing b = " + b);
            for (int a = -999; a < 1000; a++) {
                int n = 0;
                while (true) {
                    int test = n * n + a * n + b;
//                    System.out.print(test + ": " + p7primefinder.isPrime(test));
//                    System.out.println();
                    if (!p7primefinder.isPrime(test)) {
                        if (n > maxPrime) {
                            maxPrime = n;
                            maxA = a;
                            maxB = b;
                            System.out.println("New Top found=================");
                            System.out.println("Primes range from 0 to " + maxPrime);
                            System.out.println("a: " + maxA);
                            System.out.println("b: " + maxB);
                            System.out.println("a*b: " + maxA * maxB);
                        }
                        break;
                    } else {
                        n++;
                    }
                }
            }
        }
        System.out.println("Primes range from 0 to " + maxPrime);
        System.out.println("a: " + maxA);
        System.out.println("b: " + maxB);
        System.out.println("a*b: " + maxA * maxB);
    }

}
