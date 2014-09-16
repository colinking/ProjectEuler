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
public class p19sundaycounter {
    
    //Why, oh why is a century from 1901 to 2001?! 
    public static void main(String[] args) {
        int[] m2d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sundays = 0;
        int year = 1901;
        int month = 0;
        int rawday = 2;
        while (year < 2001) {
            if(rawday%7==0)
                sundays++;
            rawday+=(month==1&&isLeapY(year)?29:m2d[month]);
            month++;
            if(month%12==0) {
                year++;
                month = 0;
            }
        }
        System.out.println("# Sundays: " + sundays);
        
    }
    
    private static boolean isLeapY(int year) {
        if(year%400==0)
            return true;
        if(year%100==0)
            return false;
        return year%4 == 0;
    }
    
}
