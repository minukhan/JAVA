package chapter01.ch01_1;

import java.util.*;


public class SquareRoot {
    public static void main(String[] args) {

        System.out.println("2019250059 한민욱");



        Scanner scanner = new Scanner(System.in);

        double a;


        System.out.print("숫자를 입력하시오! : ");
        a = scanner.nextDouble();

        double sqrtValue = Math.sqrt(a);
        System.out.println(a + " 의 제곱근은? " + sqrtValue);
    }
}
