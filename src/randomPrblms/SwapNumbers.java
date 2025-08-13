package randomPrblms;/*
* This program swaps numbers
* @author ART
 */

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("before swap : " );
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
        swapNum(num1,num2);
    }

    private static void swapNum(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap : ");
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
    }
}
