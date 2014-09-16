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
public class p23nonabundant {

    public static void main(String[] args) {
        int[] summable = new int[28124]; // 0 will not be used
        ArrayList<Integer> abundantnums = new ArrayList<>();
        for (int i = 1; i <= 28123; i++) {
            if (p21amicable.calcDivisors(i) > i) {
//                System.out.println(i + " is abundant.");
                abundantnums.add(i);
            }
        }
        for(Integer v1: abundantnums) {
            for(Integer v2: abundantnums) {
                if(v1+v2 <= 28123)
                    summable[v1+v2] = 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < summable.length; i++) {
            if (summable[i] == 0) { //if this index can not be summed by two abundant numbers
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
