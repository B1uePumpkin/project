package main;

import java.util.Scanner;

public class StarBlock {
    public static void main(String[] args) {
        System.out.println("enter first number:");
        Scanner first = new Scanner(System.in);
        int one = first.nextInt();
        System.out.println("enter second number:");
        Scanner second = new Scanner(System.in);
        int two = second.nextInt();
        for (int i =0;i<two-one;i++){
            for (int j=0;j<20;j++){
                if (j<one||j>two) {
                    System.out.print("0");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
