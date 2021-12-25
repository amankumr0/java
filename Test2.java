

public class Test2 implements Runnable {
    public static void main(String[] args) {
            CommandLine.run(new Test2(), args);
    }
    public void run(){
        System.out.println("Hello World");
    }
    
}
