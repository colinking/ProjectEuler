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
public class p30fifthpowers {

    public static void main(String[] args) {
        long sum = 0;
        int power = 5;
        long i = 2;
        while (i < Math.pow(9, 5) * 6) {
            if (i == (int) (Math.pow((i / 1000000)%10, power) + Math.pow((i / 100000)%10, power) + Math.pow((i / 10000)%10, power) + Math.pow((i / 1000)%10, power) + (Math.pow((i / 100) % 10, power)) + (Math.pow((i / 10) % 10, power)) + (Math.pow(i % 10, power)))) {
                System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println("Sum: " + sum);
    }

}
