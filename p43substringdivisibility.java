package projeuler;

import java.util.ArrayList;

/**
 * @author colin
 * @date Apr 15, 2014
 * @starttime 1:43:51 PM
 * @filename p43substringdivisibility
 */
public class p43substringdivisibility {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long ans = 0;

        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Final Three Digits");

        int t = 17;
        int i = 1;
        while (t * i < 1000) {
//            System.out.println(t*i);
            String temp = String.valueOf(t * i);
            if (!containsDuplicates(temp)) {
                for (int c = temp.length(); c < 3; c++) {
                    temp = "0" + temp;
                }
                System.out.println(temp);
                arr.add(temp);
            }
            i++;
        }

        System.out.printf("Limited down to %d digits\n", arr.size());

        ArrayList<String> arr2 = new ArrayList<>();
        System.out.println("Final Four Digits");

        t = 13;
        i = 1;
        while (t * i < 1000) {
            String n1 = String.valueOf(t * i);
            if (!containsDuplicates(n1)) {
                for (int c = n1.length(); c < 3; c++) {
                    n1 = "0" + n1;
                }
                for (String temp : arr) {
                    if (!temp.substring(2).contains(n1.substring(0, 1)) && n1.substring(1).equals(temp.substring(0, 2))) {
                        arr2.add(n1.substring(0, 1) + temp);
                        System.out.println(n1.substring(0, 1) + temp);
                    }
                }
            }
            i++;
        }

        System.out.printf("Limited down to %d digits\n", arr2.size());

        ArrayList<String> arr3 = new ArrayList<>();
        System.out.println("Final Five Digits");

        t = 11;
        i = 1;
        while (t * i < 1000) {
            String n1 = String.valueOf(t * i);
            if (!containsDuplicates(n1)) {
                for (int c = n1.length(); c < 3; c++) {
                    n1 = "0" + n1;
                }
//            System.out.println("Trying: " + n1);
                for (String temp : arr2) {
                    if (!temp.substring(2).contains(n1.substring(0, 1)) && n1.substring(1).equals(temp.substring(0, 2))) {
                        arr3.add(n1.substring(0, 1) + temp);
                        System.out.println(n1.substring(0, 1) + temp);
                    }
                }
            }
            i++;
        }

        System.out.printf("Limited down to %d digits\n", arr3.size());

        ArrayList<String> arr4 = new ArrayList<>();
        System.out.println("Final Six Digits");

        t = 7;
        i = 1;
        while (t * i < 1000) {
            String n1 = String.valueOf(t * i);
            if (!containsDuplicates(n1)) {
                for (int c = n1.length(); c < 3; c++) {
                    n1 = "0" + n1;
                }
//            System.out.println("Trying: " + n1);
                for (String temp : arr3) {
                    if (!temp.substring(2).contains(n1.substring(0, 1)) && n1.substring(1).equals(temp.substring(0, 2))) {
                        arr4.add(n1.substring(0, 1) + temp);
                        System.out.println(n1.substring(0, 1) + temp);
                    }
                }
            }
            i++;
        }

        System.out.printf("Limited down to %d digits\n", arr4.size());
        
        ArrayList<String> arr5 = new ArrayList<>();
        System.out.println("Final Seven Digits");

        t = 5;
        i = 1;
        while (t * i < 1000) {
            String n1 = String.valueOf(t * i);
            if (!containsDuplicates(n1)) {
                for (int c = n1.length(); c < 3; c++) {
                    n1 = "0" + n1;
                }
//            System.out.println("Trying: " + n1);
                for (String temp : arr4) {
                    if (!temp.substring(2).contains(n1.substring(0, 1)) && n1.substring(1).equals(temp.substring(0, 2))) {
                        arr5.add(n1.substring(0, 1) + temp);
                        System.out.println(n1.substring(0, 1) + temp);
                    }
                }
            }
            i++;
        }

        System.out.printf("Limited down to %d digits\n", arr5.size());
        
        ArrayList<String> arr6 = new ArrayList<>();
        System.out.println("Final Eight Digits");

        t = 3;
        i = 1;
        while (t * i < 1000) {
            String n1 = String.valueOf(t * i);
            if (!containsDuplicates(n1)) {
                for (int c = n1.length(); c < 3; c++) {
                    n1 = "0" + n1;
                }
//            System.out.println("Trying: " + n1);
                for (String temp : arr5) {
                    if (!temp.substring(2).contains(n1.substring(0, 1)) && n1.substring(1).equals(temp.substring(0, 2))) {
                        arr6.add(n1.substring(0, 1) + temp);
                        System.out.println(n1.substring(0, 1) + temp);
                    }
                }
            }
            i++;
        }

        System.out.printf("Limited down to %d digits\n", arr6.size());
        
        ArrayList<String> arr7 = new ArrayList<>();
        System.out.println("Final Nine Digits");

        t = 2;
        i = 1;
        while (t * i < 1000) {
            String n1 = String.valueOf(t * i);
            if (!containsDuplicates(n1)) {
                for (int c = n1.length(); c < 3; c++) {
                    n1 = "0" + n1;
                }
//            System.out.println("Trying: " + n1);
                for (String temp : arr6) {
                    if (!temp.substring(2).contains(n1.substring(0, 1)) && n1.substring(1).equals(temp.substring(0, 2))) {
                        arr7.add(n1.substring(0, 1) + temp);
                        System.out.println(n1.substring(0, 1) + temp);
                    }
                }
            }
            i++;
        }

        System.out.printf("Limited down to %d digits\n", arr7.size());

        long endTime = System.nanoTime();
        System.out.println("Time Elapsed: 0." + (endTime - startTime) + "s");
        System.out.println("Answer: " + ans);
    }

    private static boolean containsDuplicates(String n) {
        if (n.length() == 1) {
            return true;
        }
        if (n.charAt(0) == n.charAt(1)) {
            return true;
        }
        if (n.length() == 3) {
            if (n.charAt(0) == n.charAt(2) || n.charAt(1) == n.charAt(2)) {
                return true;
            }
        }
        return false;
    }
}
