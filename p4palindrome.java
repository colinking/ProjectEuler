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
public class p4palindrome {

    public static void main(String[] args) {
        int val1 = 999;
        int val2 = 999;
        int longest = 0;
        while (val2 >= 0) {
            while (val1 >= 0) {
                if (isPalindrome(String.valueOf(val1 * val2)) && val1 * val2 > longest) {
                    longest = val1 * val2;
                }
                val1--;
            }
            val1 = 999;
            val2--;
        }
        System.out.println(longest);
    }

    public static boolean isPalindrome(String check) {
//        System.out.println("testing..." + check);
        if (check.length() <= 1) {
            return true;
        }
        if (check.charAt(0) != check.charAt(check.length() - 1)) {
            return false;
        } else {
            return isPalindrome(check.substring(1, check.length() - 1));
        }
    }
    
    public static boolean isPalindrome(int check) {
        return isPalindrome(String.valueOf(check));
    }
    public static boolean isPalindrome(long check) {
        return isPalindrome(String.valueOf(check));
    }

}
