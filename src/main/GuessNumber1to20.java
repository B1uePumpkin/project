package main;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber1to20 {
    public static void main(String[] args) {
        boolean end=false;
        boolean flag=false;
        int max=20;
        int min=1;
        Random random=new Random();
        int secret = random.nextInt(19)+1;
        System.out.println(secret);

        while (!end){
            for (int i=0;i<3;i++){
                System.out.println(min+"to"+max);
                Scanner scanner=new Scanner(System.in);
                int num=scanner.nextInt();
                if (num==secret){
                    end=true;
                    flag=true;
                }else{
                    if (num<secret){
                        min=num;
                        flag=false;
                    }else{
                        max=num;
                        flag=false;
                    }
                }
            }
            end=true;
        }
        if (flag){
            System.out.println("you win!!!");
        }else {
            System.out.println("you loose!!!");
        }
    }
}
