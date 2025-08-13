package randomPrblms;
/*
* This program prints if a given number is even or odd
@author ART
 */


import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(isEven(input) ==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        System.out.println(isEvenOrOdd(input)?"even":"odd");
    }
    //logic using remainder
    private static int isEven(int input) {
        return input % 2;
    }

    //logic using bit operation
    private static boolean isEvenOrOdd(int num){
        if((num & 1) == 0){
            return true;
        }else
            return false;
    }

}
