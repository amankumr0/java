class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) System.out.println("From A i=" + i);
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++) System.out.println("From B j=" + j);
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++) System.out.println("From C k=" + k);
        System.out.println("Exit from C");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Thread a1 = new A();
        Thread a2 = new B();
        Thread a3 = new C();
        a1.start();
        a2.start();
        a3.start();

    }
    
}
