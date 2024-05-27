package chapter04;

public class XCopy {
    public static void main(String[] args){

        System.out.println("2019250059 한민욱");
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);

        System.out.println(orig + " " + y);
    }

    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}