package JaiMataDi;

class Thakur {
    public String name = "Aman";
    private int id = 02;
    protected double d = 52.55;
    int q = 8;

    public void meth1() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(d);
        System.out.println(q);

    }

}

public class Opening {
    public static void main(String[] args) {
        Thakur fq = new Thakur();
        // fq.meth1();
        System.out.println(fq.name);
        // System.out.println(fq.id);
        System.out.println(fq.d);
        System.out.println(fq.q);
    }

}