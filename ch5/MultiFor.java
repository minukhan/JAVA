package chapter05;

public class MultiFor {
    public static void main(String[] args){
        System.out.println("2019250059 한민욱");

        for(int x=0;x<4;x++){
            for(int y=4;y>2;y--){
                System.out.println(x+" " + y);
            }
            if (x==1){
                x++;
            }
        }
    }
}
