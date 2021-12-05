package main;

import java.util.Scanner;

public class sellingmachine {
    public static void main(String[] args) {
        int milktea = 20;
        int cola = 15;
        int juice = 10;
        System.out.println("請投幣1元");
        Scanner oneDollar = new Scanner(System.in);
        int one = oneDollar.nextInt();
        System.out.println("請投幣5元");
        Scanner fiveDollars = new Scanner(System.in);
        int five = fiveDollars.nextInt();
        System.out.println("請投幣10元");
        Scanner tenDollars = new Scanner(System.in);
        int ten = tenDollars.nextInt();
        int sum = one+5*five+10*ten;
        System.out.println(sum);
        int s = 0;
        int total = 0;
        while (s!=4){
            System.out.println("請選擇商品。奶茶(20元)請按1，可樂(15元)請按2，果汁(10元)請按3，選擇完畢請按4");
            Scanner select = new Scanner(System.in);
            s = Integer.parseInt(select.next());
            if (s!=1){
                if (s!=2){
                    if (s!=3){
                        break;
                    }else {
                        total = total + 10;
                    }
                }else{
                    total = total + 15;
                }
            }else {
                total = total + 20;
            }
            int back= sum-total;
            if (back>0){
                System.out.println("請補差額");
                break;
            }
            System.out.println("餘額:"+back);
        }


        int back= sum-total;
        System.out.println(back);
        if (back >= 0){
            System.out.println("找回10元"+back/10+"個");
            System.out.println("找回5元"+back%10/5+"個");
            System.out.println("找回1元"+back%10%5+"個");

        }else{
            System.out.println("請補10元"+(back/10)*(-1)+"個");
            System.out.println("請補5元"+back%10/5*(-1)+"個");
            System.out.println("請補1元"+back%10%5*(-1)+"個");

        }

    }
}