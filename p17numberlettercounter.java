/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

import java.util.HashMap;

/**
 *
 * @author colin
 */
public class p17numberlettercounter {

    public static void main(String[] args) {
        int start = 1;
        int end = 9999;
        System.out.printf("The sum of the numbers from %d to %d is %d.\n", start, end, countLetters(start, end));
    }

    //inclusive
    private static long countLetters(int startn, int maxn) {
        long numletters = 0;
        HashMap<Integer, Integer> ltrcnt = new HashMap<>();
        ltrcnt.put(0, 4); //zero
        ltrcnt.put(1, 3); //one
        ltrcnt.put(2, 3); //two
        ltrcnt.put(3, 5); //three
        ltrcnt.put(4, 4); //four
        ltrcnt.put(5, 4); //five
        ltrcnt.put(6, 3); //six
        ltrcnt.put(7, 5); //seven
        ltrcnt.put(8, 5); //eight
        ltrcnt.put(9, 4); //nine
        ltrcnt.put(10, 3); //ten
        ltrcnt.put(11, 6); //eleven
        ltrcnt.put(12, 6); //twelve
        ltrcnt.put(13, 8); //thirteen
        ltrcnt.put(14, 8); //fourteen
        ltrcnt.put(15, 7); //fifteen
        ltrcnt.put(16, 7); //sixteen
        ltrcnt.put(17, 9); //seventeen
        ltrcnt.put(18, 8); //eighteen
        ltrcnt.put(19, 8); //nineteen
        ltrcnt.put(20, 6); //twenty
        ltrcnt.put(30, 6); //thirty
        ltrcnt.put(40, 5); //forty
        ltrcnt.put(50, 5); //fifty
        ltrcnt.put(60, 5); //sixty
        ltrcnt.put(70, 7); //seventy
        ltrcnt.put(80, 6); //eighty
        ltrcnt.put(90, 6); //ninety
        ltrcnt.put(100, 7); //hundred
        ltrcnt.put(1000, 8); //thousand
        for (int i = startn; i <= maxn; i++) {
            //ones, tens, hundreds, thousands
            int[] digits = {i % 10, (i / 10) % 10, (i / 100) % 10, (i / 1000) % 10};
//            System.out.print("(" + digits[3] + ", " + digits[2] + ", " + digits[1] + ", " + digits[0] + ") ");
            int tempcnt = 0;
            if (i < 20) {
                tempcnt = ltrcnt.get(i);
//                System.out.println(i + ": " + tempcnt);
                numletters += tempcnt;
                continue;
            }

            //unnecessary for this problem, but expands use beyond 1000
            if (digits[3] != 0) {
                //"one thousand", "two thousand", etc.
                tempcnt = ltrcnt.get(digits[3]) + ltrcnt.get(1000);
                //"and" (if there is something after the thousands digit
                if (i % 1000 != 0) {
                    tempcnt += 3;
                }
            }
            if (digits[2] != 0) {
                //"one hundred", "two hundred", etc.
                tempcnt = ltrcnt.get(digits[2]) + ltrcnt.get(100);
                //"and" (if there is something after the hundreds digit
                if (i % 100 != 0) {
                    tempcnt += 3;
                }
            }
            if (digits[1] != 0) {
                //if it is 90, 80, 70..20, 10 or if it is <= 19 (aka tens digit has a 1)
                if (digits[0] == 0 || digits[1] <= 1) {
                    tempcnt += ltrcnt.get(i % 100);
//                    System.out.println(i + ": " + tempcnt);
                    numletters += tempcnt;
                    continue;
                } else {
                    tempcnt += ltrcnt.get(digits[1] * 10) + (digits[0] != 0 ? ltrcnt.get(digits[0]) : 0);
                }
            } else {
                tempcnt += (digits[0] != 0 ? ltrcnt.get(digits[0]) : 0);
            }
//            System.out.println(i + ": " + tempcnt);
//            System.out.println(numletters + " + " + tempcnt + " = " + tempcnt + numletters);
            numletters += tempcnt;
        }
        return numletters;
    }

}
