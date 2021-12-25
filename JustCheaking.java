abstract class Aman {
    abstract int java1();
}

class Box3 extends Aman {
    public int java1() {
        System.out.println("Fuck You Bitch");
        return 5;
    }
}

public class JustCheaking {
    public static void main(String[] args) {
        Box3 a = new Box3();
        int c = a.java1();
        // System.out.println();
        System.out.println(c);
    }
}
