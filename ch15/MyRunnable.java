package chapter15;


public class MyRunnable extends Runnable {

    public void run()
    {
        go();
    }

    public void go() {

        //*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }//*/

        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }


    public static void main(String[] args)
    {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread((java.lang.Runnable) threadJob);
        myThread.start();
        System.out.println("back in main");
    }

}