package randomPrblms;/*
* This program prints multiplication table of a number
* @author ART
 */

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printMutliTable(input);
    }

    private static void printMutliTable(int input) {
        for(int i=1;i<=10;i++){
            System.out.println(input + " * " + i + " = " + input * i );
        }
    }

}
