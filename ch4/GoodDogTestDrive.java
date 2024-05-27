package chapter04;

class GoodDogTestDrive {
    public static void main(String[] args) {

        System.out.println("2019250059 한민욱");

        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        GoodDog three = new GoodDog();
        three.setSize(35);

        one.bark();
        two.bark();
        three.bark();
    }
}