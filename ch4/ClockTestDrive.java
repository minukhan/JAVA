package chapter04;

class ClockTestDrive {
    public static void main(String[] args) {

        System.out.println("2019250059 한민욱");
        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }

}