/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

// NOT FINISHED, DONE BY HAND
/**
 *
 * @author colin
 */
public class p5smallestmultiple {

    public static void main(String[] args) {
        int max = 10;
        int ans = 1;
        for (int index = 1; index < max; index++) {
            if (isPrime(index)) {
                ans *= index;
            }
        }
        System.out.println("Answer: " + ans);
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