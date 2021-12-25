

class Parent1 {
    protected Parent1() {
        this(85);
        System.out.println("I am in constructor 1");
    }

    Parent1(int a) {
        this(4, 5);
        System.out.println("I am in parent 2   " + a);
    }

    Parent1(int a, int b) {
        System.out.println("I am in parent 3    " + (a + b));
    }
}

public class UsingThis {
    public static void main(String[] args) {
        new Parent1();
        System.out.println("i am in main");
    }
}
