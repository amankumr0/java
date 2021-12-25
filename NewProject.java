class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am in thread");
            System.out.println("My thread is running");
            i++;
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        int j = 0;
        while (j < 4000) {
            System.out.println("i am cooking");
            System.out.println("I am using whatsaap");
            j++;
        }
    }
}

public class NewProject {
    public static void main(String[] args) {
        MyThread amn = new MyThread();
        MyThread1 thk = new MyThread1();
        amn.start();
        thk.start();

    }

}
