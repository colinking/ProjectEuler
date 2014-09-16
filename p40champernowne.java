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
public class p40champernowne {
    
    public static void main(String[] args) {
        String value = "";
        int n = 1;
        while(value.length() < 1000000) {
//            System.out.println(value);
            value = value + n;
            n++;
        }
        System.out.println("Done");
        System.out.println(value);
        long sum = 1;
        for(int i = 1; i <= 1000000; i*=10) {
            System.out.println(i + ": " + sum + "*" + value.charAt(i - 1));
            sum *= Character.getNumericValue(value.charAt(i - 1));
        }
        System.out.println(sum);
    }
    
}
