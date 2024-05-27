package chapter02;

public class EchoTestDrive {
    public  static void main(String [] args ){
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x =0;
        System.out.println("2019250059 한민욱");
        while (x<4){
            e1.hello();
            e1.count = e1.count +1;

            if (x>0){
                e2.count =e2.count +1;
            }
            if (x>1){
                e2.count = e2.count +e1.count;
            }
            x=x+1;

        }
        System.out.println(e2.count);
    }
}
