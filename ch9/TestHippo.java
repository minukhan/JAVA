package chapter09;

class Animal {
    public Animal() {
        System.out.println("Making an Animal");
    }
}

class Hippo extends Animal {
    public Hippo() {
        System.out.println("Making a Hippo");
    }
}

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("2019250059 한민욱");
        System.out.println("Starting...");
        Hippo h = new Hippo();
    }
}