package chapter01.ch01_1;

public class PoolPuzzleOne {
    public static void  main (String [] args){

        System.out.println("2019250059 한민욱");
        int x=0;

        while (x<4){
            System.out.print("a");
            if(x<1){
                System.out.print(" ");
            }
            System.out.print("n");
            if(x>1){
                System.out.print(" oyster");
                x=x+2;
            }
            if (x==1){
                System.out.print("noys");

            }
            if(x<1){
                System.out.print("oise");
            }
            System.out.println("");
            x=x+1;
        }
    }
}
