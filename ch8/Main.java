package chapter08;

import java.util.*;

abstract class Shape {
    double area;
    int width;
    int height;
    int radian;

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public int getRadian() {
        return radian;
    }

    public void setRadian(int radian) {
        this.radian = radian;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class Rectangle extends Shape {
}

class Triangle extends Shape {
}

class Circle extends Shape {
}

public class Main {
    public static double calcArea(Shape s) {
        double area = 0.0;
        if (s instanceof Rectangle) {
            int w = ((Rectangle) s).getWidth();
            int h = ((Rectangle) s).getHeight();
            area = (double) (w * h);
        }
        if (s instanceof Triangle) {
            int w = ((Triangle) s).getWidth();
            int h = ((Triangle) s).getHeight();
            area = (double) (w * h / 2);
        }
        if (s instanceof Circle) {
            int r = ((Circle) s).getRadian();
            area = (double) (r * r * 3.14);
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println("2019250059 한민욱");
        Scanner sc = new Scanner(System.in);
        Shape[] i = new Shape[3];
        i[0] = new Rectangle();
        i[1] = new Triangle();
        i[2] = new Circle();
        String scanHelper = "";
        for (int x = 0; x < 3; x++) {
            if (i[x] instanceof Circle) {
                System.out.print(i[x].getClass().toString().split("\\.")[1] + "의Radian을 입력: ");
                scanHelper = sc.next();
                i[x].setRadian(Integer.parseInt(scanHelper));
            } else {
                System.out.print(i[x].getClass().toString().split("\\.")[1] + "의width와height를 입력: ");
                scanHelper = sc.next();
                i[x].setWidth(Integer.parseInt(scanHelper));
                scanHelper = sc.next();
                i[x].setHeight(Integer.parseInt(scanHelper));
            }
            i[x].setArea(calcArea(i[x]));
        }
        for (int x = 0; x < 2; x++) {
            System.out.println(i[x].getClass().toString().split("\\.")[1] + "의 값은" + Double.toString(i[x].getArea()));
        }
        System.out.println(i[2].getClass().toString().split("\\.")[1] + "의 값은" + Double.toString((double) i[2].getRadian() * i[2].getRadian()) + "π(" + Double.toString(i[2].getArea()) + ")");
    }
}