interface DemoAno1{
    public void meth1();
    public void meth2();

}
public class Anonymous1 {
    public static void main(String[] args) {
        DemoAno1 obj = new DemoAno1()  {
            @Override
            public void meth1() {
                System.out.println("I am in meth1");
            }
            @Override
            public void meth2() {
                System.out.println("I am in meth2");
            }
        };

        
        obj.meth1();
    }
    
}
