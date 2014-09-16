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
public class p35circularprimes {
    
    public static void main(String[] args) {
        final int MAX = 1000000;
        int count = 0;
        for(int i = 2; i<MAX; i++) {
            String temp = String.valueOf(i);
            while(true) {
                if(p7primefinder.isPrime(Integer.valueOf(temp))) {
                    temp = temp.substring(1, temp.length()) + temp.charAt(0);
                    if(temp.equals(String.valueOf(i))) {
//                        System.out.println(i);
                        count++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("Answer: " + count);
    }
    
}
