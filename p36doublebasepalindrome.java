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
public class p36doublebasepalindrome {

    public static void main(String[] args) {
        final int MAX = 1000000;
        long sum = 0;
        for(int i = 1; i < MAX; i++) {
            if(p4palindrome.isPalindrome(i) && p4palindrome.isPalindrome(convertBase(i, 2))) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }

    public static String convertBase(int v, int base) {
        if(base > 10) {
            throw new IllegalArgumentException("(Colin) Base >= 10");
        }
        String ans = "";
//        System.out.printf("ans: %s, v: %d, base: %d\n", ans, v, base);
        while (v >= 1) {
            ans = v % base + ans;
            v /= base;
//            System.out.printf("ans: %s, v: %d, base: %d\n", ans, v, base);
        }
        return ans;
    }

}
