package randomPrblms;/*
* This program prints closest number of n if it is divisible by m.
* @author ART
 */

import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(closeNumber(n,m));
    }

    private static int closeNumber(int n, int m) {

        return n - (n%m);
    }
}
