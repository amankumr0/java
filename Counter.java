class Counter1{
    static int count =0;
    Counter1(){
        count++;
        System.out.println(count);
    }
}

public class Counter {
    public static void main(String[] args) {
        Counter1 a1 = new Counter1();
        Counter1 a2 = new Counter1();
        Counter1 a3 = new Counter1();
    }
    
}
