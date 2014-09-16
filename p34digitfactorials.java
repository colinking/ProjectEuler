/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeuler;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author colin
 */
public class p34digitfactorials {
    
    public static void main(String[] args) {
        final long MAX = 2000000;
        long sum = 0;
        for(int i = 3; i < MAX; i++) {
            long tsum = 0;
            for(Integer digit: getDigits(i)) {
                tsum += factorial(digit);
            }
            if(tsum == i) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
    public static long factorial(int v) {
        if(v == 0)
            return 1;
        return factorial(v-1) * v;
    }
    
    //Saved for future use
    public static ArrayList<Integer> getDigits(BigInteger v) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(char c: v.toString().toCharArray()) {
            arr.add(Character.getNumericValue(c));
        }
        return arr;
    }
    public static ArrayList<Integer> getDigits(long v) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(char c: String.valueOf(v).toCharArray()) {
            arr.add(Character.getNumericValue(c));
        }
        return arr;
    }
    public static ArrayList<Integer> getDigits(int v) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(char c: String.valueOf(v).toCharArray()) {
            arr.add(Character.getNumericValue(c));
        }
        return arr;
    }
    
}
