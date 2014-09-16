/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class p9pythagoreantriple1000 {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        double c;
        while (a < 1000) {
            while (b < 1000) {
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if (a + b + c == 1000) {
                    System.out.println("Answer found");
                    System.out.println(a*b*(int)c);
                    break;
                }
                b++;
            }
            b = 1;
            a++;
        }
        //System.out.println("NO ANSWER FOUND -- ERROR");
    }

}
