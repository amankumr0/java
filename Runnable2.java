class MyRunnableThread implements Runnable {
    public void run() {
        // int i = 0;
        // while (i < 3)
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");

        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");

        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");
        System.out.println("This thread 1");

        // i++;
    }
}

class MyRunnableThread1 implements Runnable {
    public void run() {

        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");

        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");
        System.out.println("This thread 2");

    }
}

public class Runnable2 {
    public static void main(String[] args) {
        MyRunnableThread bullet1 = new MyRunnableThread();
        Thread gun1 = new Thread(bullet1);

        MyRunnableThread1 bullet2 = new MyRunnableThread1();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}