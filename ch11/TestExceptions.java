package chapter11;


public class TestExceptions {

    public static void main(String[] args) {

        System.out.println("2019250059 한민욱");

        String testString = "yes";

        try {
            System.out.println("Start try!");
            doRisky(testString);
            System.out.println("End try!");
        } catch (ScaryException se) {
            System.out.println("Scary exception!");
        } finally {
            System.out.println("Finally!");
        }

        System.out.println("End of main!");
    }

    private static void doRisky(String test) throws ScaryException {
        System.out.println("Start risky method!");

        if ("Yes".equals(test)) {
            throw new ScaryException();
        }

        System.out.println("End risky!");
        return;
    }
}

class ScaryException extends Exception{}