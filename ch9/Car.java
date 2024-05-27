package chapter09;

import java.awt.Color;

abstract class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }
}

class Mini extends Car {
    Color color;

    public Mini() {
        this(Color.RED);
        System.out.println(color);
    }

    public Mini(Color c) {
        super("Mini");
        color = c;
    }

    public static void main(String[] args) {
        System.out.println("2019250059 한민욱");
        Mini mini = new Mini();
    }
}