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
public class p10primesummation {

    public static void main(String[] args) {
        int max = 2000000;
        long sum = 0;
        int curr = 1;
        while(curr < max) {
            curr++;
            if(isPrime(curr)) {
                sum += curr;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int val) {
        int check = 2;
        while (check <= Math.sqrt(val)) {
            if (val % check == 0) {
                return false;
            }
            check++;
        }
        return true;
    }
    
}
