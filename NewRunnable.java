// class MyThreaading3 extends Thread {
//     public MyThreaading3(String name) {
//         super(name);
//     }

//     public void run() {
//         int i = 0;
//         while (i < 20) {
//             System.out.println("I m in thread");
//             i++;
//         }

//     }
// }

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    @Override
    public void run() {
        int j = 0;
        while (j < 20) {
            System.out.println("Good Morning:" + super.getName());
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
        }

    }
}

public class NewRunnable {
    public static void main(String[] args) {
        // MyThreaading3 t1 = new MyThreaading3("Aman");
        MyThr t2 = new MyThr("Aman (The most priority)");
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        MyThr t3 = new MyThr("Shubham");
        t3.start();
        try {
            t2.join();
        } catch (Exception a) {
            System.out.println(a);
        }

        MyThr t4 = new MyThr("Abhishek");
        t4.start();
        MyThr t5 = new MyThr("Pradhan");
        t5.setPriority(Thread.NORM_PRIORITY);
        t5.start();
        MyThr t6 = new MyThr("Vivek");
        t6.start();
        MyThr t7 = new MyThr("Tiwari (The Least priority)");
        t7.setPriority(Thread.MIN_PRIORITY);
        // t1.start();

        t7.start();
    }
}
