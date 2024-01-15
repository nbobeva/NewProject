package Homework1;

import java.util.Scanner;

public class Task01{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println("Input the third number: ");
        int num3 = in.nextInt();

        if(num1<= num3 & num3 <= num2){
            System.out.println(
                    "The number is not between num1 and num2 ");
        }

    }

}
