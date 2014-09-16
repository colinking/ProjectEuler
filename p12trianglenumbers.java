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
public class p12trianglenumbers {

    public static void main(String[] args) {
        int divisors = 0;
        int counter = 1;
        int val = 0;
        while (divisors <= 500) {
            val += counter;
            counter++;
            divisors = calcDivisors(val);
//            System.out.println("TEST: " + val + ": " + divisors);
        }
        System.out.println("Answer: " + val);
    }
    
    /*
    Returns the number of divisors
    */
    public static int calcDivisors(int val) {
        int check = 1;
        int max = (int) Math.sqrt(val);
//        System.out.print("(Max: " + max + ") ");
        int divisors = 0;
//        System.out.print(val + ": ");
        while (check <= max) {
            if (val % check == 0) {
//                System.out.print(check + ", ");
                divisors+=2;
                if (check == max && Math.sqrt(val) - max == 0) //if it is the square root
                {
                    divisors--;
                } else { //if it is not the sqrt, print the other value
//                    System.out.print(val/check + ", ");
                }
            }
            check++;
        }
//        System.out.println();
        return divisors;
    }
    //1, 2, 4, 7, 14, 28 - 6
    //1, 2, 3, 4, 6, 9, 12, 18, 36 - 9
}
