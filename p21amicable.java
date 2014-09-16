/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

import java.util.ArrayList;

/**
 *
 * @author colin
 */
public class p21amicable {

    public static void main(String[] args) {
        int max = 10000;
        int sum = 0;
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 220; i < max; i++) {
            int v1 = calcDivisors(i);
            if(calcDivisors(v1) == i && v1 != i && v1 > i) {
                answer.add("(" + i + ", " + v1 + ")");
                sum += v1 + i;
            }
        }
        for(String v: answer) {
            System.out.println(v);
        }
        System.out.println(sum);
    }

    public static int calcDivisors(int val) {
        int check = 1;
        int max = (int) Math.sqrt(val);
//        System.out.print("(Max: " + max + ") ");
        ArrayList<Integer> divisors = new ArrayList<>();
//        System.out.print(val + ": ");
        while (check <= max) {
            if (val % check == 0) {
//                System.out.print(check + ", ");
                divisors.add(check);
                if (check == max && Math.sqrt(val) - max == 0) //if it is the square root
                {
                    //too lazy to switch
                } else if(val/check != val) { //if it is not the sqrt, print the other value
                    divisors.add(val / check);
                }
            }
            check++;
        }
//        System.out.println();
        int sum = 0;
        for(Integer j: divisors) {
            sum+= j;
        }
        return sum;
    }

}
