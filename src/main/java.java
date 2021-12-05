package main;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        System.out.println("Please enter number 1 to 10");
        int num = 0;
        while (secret != num) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            num = Integer.parseInt(s);
            if (num > secret) {
                System.out.println("smaller");
            }
            if (num < secret) {
                System.out.println("bigger");
            }
        }
        System.out.println("bingo");

    }
}
