package main;

import java.util.Random;
import java.util.Scanner;

public class guessnumber1to10 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        System.out.println("please enter a number form 1 to 10 !!!");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int num = Integer.parseInt(s);
        if (num > secret){
            System.out.println("smaller");
        }
        if (num < secret){
            System.out.println("bigger");
        }
        if (num == secret){
            System.out.println("bingo");
        }
    }
}
