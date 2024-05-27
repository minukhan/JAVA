package chapter03;

import java.util.Scanner;
import java.util.*;


    public class PlanetWeight {
        public static void main(String[] args) {

            System.out.println("2019250059 한민욱");

            Scanner scanner = new Scanner(System.in);

            double a;
            String b;
            String c ;
            boolean k = true;
            int x = 0;

            while (x<9) {
                System.out.print("Please enter any planet name : ");
                b = scanner.next();
                System.out.print("Please enter its weight : ");
                a = scanner.nextDouble();

                System.out.println("your weight on  " + b + " is " + a );

                System.out.print("continue (Y/N)? : ");

                String str = scanner.nextLine();
                c = scanner.next();

                x++;


            }
            System.out.println("thank you For working!");
        }
    }

