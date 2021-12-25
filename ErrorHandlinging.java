class ThrowDemo{
    static void demoproc(){
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e;
        }
    }
}

public class ErrorHandlinging {
    public static void main(String[] args) {
        try {
            ThrowDemo.demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught" + e);
        }
    }
}
