/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author colin
 */
public class p42codedtrianglenumbers {

    public static void main(String[] args) throws FileNotFoundException {

        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> words = new ArrayList<>();
        Scanner scan = new Scanner(new File("src/data/p42words.txt"));
        String rawdata = scan.nextLine();
        for (String d : rawdata.split(",")) {
            words.add(d.substring(1, d.length() - 1));
        }
        int triwords = 0;
        for(String word: words) {
            int sum = 0;
            for(char c: word.toCharArray()) {
                sum += alphabet.indexOf(c) + 1;
            }
            if(isTriNum(sum))
                triwords++;
        }
        System.out.println(triwords);
    }

    public static boolean isTriNum(long n) {
        long i = (long) Math.sqrt(n);
        long test;
        do {
            test = i * (i + 1) / 2;
            if (n == test) {
                return true;
            }
            i++;
        } while (n > test);
        return false;
    }

}
