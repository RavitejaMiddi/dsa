package randomPrblms;/*
* This program prints sum of first N natural numbers
* @author ART
 */

import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printSum(input);
        sumUsingFormula(input);
    }
    /*    Time complexity O(1)
        Space O(1)*/
    private static void sumUsingFormula(int input) {
        System.out.println(input * ((input + 1 )/ 2));
    }

    /*    Time complexity O(n)
        Space O(1)*/
    private static void printSum(int input) {
        int sum = 0;
        for(int i=1;i<=input;i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
