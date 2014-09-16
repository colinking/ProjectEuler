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
public class p33digitcanceling {

    public static void main(String[] args) {
        for (int repeatn = 1; repeatn <= 9; repeatn++) {
            for (int n = 0; n <= 9; n++) {
                for (int d = 0; d <= 9; d++) {
                    int num = 10*n + repeatn;
                    int den = 10*d + repeatn;
                    if((double)num/den < 1 && (double)num/den == (double) n/d) {
                        System.out.printf("_r/_r %d: %d/%d = %d/%d\n", repeatn, num, den, n, d);
                    }
                    //Hmm..I guess this is the only scenario where it works?
                    num = 10*n + repeatn;
                    den = 10*repeatn + d;
                    if((double)num/den < 1 && (double)num/den == (double) n/d) {
                        System.out.printf("_r/r_ %d: %d/%d = %d/%d\n", repeatn, num, den, n, d);
                    }
                    num = 10*repeatn + n;
                    den = 10*d + repeatn;
                    if((double)num/den < 1 && (double)num/den == (double) n/d) {
                        System.out.printf("r_/_r %d: %d/%d = %d/%d\n", repeatn, num, den, n, d);
                    }
                    num = 10*repeatn + n;
                    den = 10*repeatn + d;
                    if((double)num/den < 1 && (double)num/den == (double) n/d) {
                        System.out.printf("r_/r_ %d: %d/%d = %d/%d\n", repeatn, num, den, n, d);
                    }
                }
            }
        }
    }
}
