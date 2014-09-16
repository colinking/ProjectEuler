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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author colin
 */
public class p22names {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("src/data/p22names.txt"));
            String data = scan.next();
            //removes quotes and commas
            for (String d : data.split(",")) {
                names.add(d.substring(1, d.length() - 1));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(p22names.class.getName()).log(Level.SEVERE, null, ex);
        }

        names.sort(null);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        long tsum = 0;
        for (String n : names) {
            int sum = 0;
            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);
                sum += (alphabet.indexOf(c) + 1) * (names.indexOf(n) + 1);
            }
            System.out.printf("%s = %s\n", n, sum);
            tsum += sum;
        }
        System.out.println("Total: " + tsum);

    }

}
