/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

/**
 *
 * @author colin
 */
public class p37truncatableprimes {

    public static void main(String[] artgs) {
        long startTime = System.nanoTime();
        //the first and last digits must be 2, 3, 5, 7
//        System.out.print("Primes under 10: ");
//        for (int i = 2; i < 10; i++) {
//            if (p7primefinder.isPrime(i)) {
//                System.out.print(i + ", ");
//            }
//        }
//        System.out.println();
//        System.out.print("Primes under 100: ");
//        for (int i = 10; i < 100; i++) {
//            if (p7primefinder.isPrime(i)) {
//                System.out.print(i + ", ");
//            }
//        }
//        System.out.println();
//        System.out.print("Primes under 1000: ");
//        for (int i = 100; i < 1000; i++) {
//            if (p7primefinder.isPrime(i)) {
//                System.out.print(i + ", ");
//            }
//        }
//        System.out.println();
        int sum = 0, count = 0;
        final int MAX = 1000000;
        for (int i = 10; i <= MAX; i++) {
            boolean failed = false;
            int temp = i;
            while (temp > 0) {
                if (p7primefinder.isPrime(temp)) {
                    temp /= 10;
                } else {
                    failed = true;
                    break;
                }
            }
            if (!failed) {
                temp = Integer.valueOf(String.valueOf(i).substring(1));
                while (true) {
                    if (p7primefinder.isPrime(temp)) {
                        if (temp > 9) {
                            temp = Integer.valueOf(String.valueOf(temp).substring(1));
                        } else {
                            break;
                        }
                    } else {
                        failed = true;
                        break;
                    }
                }
            }
            if (!failed) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Time Elapsed: 0." + (endTime - startTime) +"s");
        System.out.println(count + " values with a sum of: " + sum);
    }

}
