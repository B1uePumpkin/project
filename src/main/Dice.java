package main;

public class Dice {
    public static void main(String[] args) {
        int point;
        int[] sum=new int[6];
        int[] count=new int[6];
        for (int i=0;i<10;i++);{
            point=(int) (Math.random()*6+1);
            count[point-1]++;
            System.out.println(point);

        }
        System.out.println();
        for (int j=0;j<6;j++);{
            int k=0;
            k=k++;
            System.out.println(k+1 + "點出現"+ count[k]+"次");
        }
    }
}
