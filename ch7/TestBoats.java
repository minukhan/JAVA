package chapter07;

public class TestBoats {
    public static void main(String[] args) {

        System.out.println("2019250059 한민욱");
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}