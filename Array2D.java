class MyTh6 extends Thread{
    public void run(){
        for(int i =0; i<= 4000; i++){
            System.out.println("I am busy 1");
            System.out.println("Hello");

        }
    }
}

class MyTh8 extends Thread{
    public void run(){
        for(int i =0; i<= 4000; i++){
            System.out.println("I am busy in printing mythr2");
            System.out.println("hiiiii");
        }
    }
}
public class Array2D{
    public static void main(String[] args) {
        MyTh6 t1 = new MyTh6();
        MyTh8 t2 = new MyTh8();
        t1.start();
        t2.start();
    }
}