package Homework1;

import java.util.Scanner;

public class Task07{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int x =1; x<=100; x++){
            if(x>=54 && x<= 74){
                continue;
            }
            System.out.println(x);
       }
    }
}

