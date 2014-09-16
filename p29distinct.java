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
public class p29distinct {

    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(2);
        int b = 2;
        int max = 100;
        ArrayList<BigInteger> nums = new ArrayList<>();
        while (a.compareTo(BigInteger.valueOf(max)) <= 0) {
            while (b <= max) {
                BigInteger temp = a.pow(b);
//                System.out.println(a + "^" + b + "=" + temp);
                if(!nums.contains(temp))
                    nums.add(temp);
                b++;
            }
            b = 2;
            a = a.add(BigInteger.ONE);
        }
        System.out.println(nums.size());
    }

}
