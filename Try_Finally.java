import javax.management.RuntimeErrorException;

class DemoTry{
    public static void hh(){
        try{
            System.out.println("Inside HH");
            throw new ArithmeticException("Error");
        }
        finally{
            System.out.println("hh finally");
        }
    }

    public void GG() {
        try{
            System.out.println("Inside");
            return;
        } finally{
            System.out.println("Finally");
        }
    }
}

public class Try_Finally {
    public static void main(String[] args) {
        
    }
}
