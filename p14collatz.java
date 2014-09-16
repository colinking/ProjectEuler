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
public class p14collatz {

    public static void main(String[] args) {
        long limit = 1000000;
        long val = limit;
        long counter = limit;
        long lseq = 0; //current longest
        long lval = 0; //starting number for lseq
        long tseq = 1; //temporary
        while (counter > 0) {
//            System.out.print("TEST: " + counter + ", ");
            while (val > 1) {
                if (val % 2 == 0) {
                    val /= 2;
                } else {
                    val = 3 * val + 1;
                }
//                System.out.print(val + ", ");
                tseq++;
            }
            if(tseq > lseq) {
                lseq = tseq;
                lval = counter;
                System.out.println("New top: (" + lval + ", " + lseq + ")");
            }
            tseq = 1;
            counter--;
            val = counter;
//            System.out.println();
        }
        System.out.println(lseq + " - " + lval);
    }

}
