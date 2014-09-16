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
public class p7primefinder {

    public static void main(String[] args) {
        int primeToFind = 10001;
        int primesFound = 0;
        int currCheck = 1;
        while (primesFound < primeToFind) {
            currCheck++;
            if (isPrime(currCheck)) {
                primesFound++;
            }
        }
        System.out.println("Answer: " + currCheck);
    }

    public static boolean isPrime(int val) {
        int check = 2;
        val = Math.abs(val);
        if(val <= 1)
            return false;
        while (check <= Math.sqrt(val)) {
            if (val % check == 0) {
                return false;
            }
            check++;
        }
        return true;
    }
}
