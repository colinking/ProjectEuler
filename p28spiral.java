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
public class p28spiral {

    public static void main(String[] args) {
        int sideLength = 1001;
        int value = 1;
        int max = (int) Math.pow(sideLength, 2);
        long sum = 1;
        int diff = 2;
        while(value < max) {
            for(int i = 0; i < 4; i++) {
                value += diff;
                sum += value;
            }
            diff+=2;
        }
        System.out.println(sum);
    }
}
