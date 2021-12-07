package main;

public class StarPyramid {
    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            for (int j=0;j<19;j++){
                if (10 - i >= j||10+i<=j){
                    System.out.print(" ");

                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
