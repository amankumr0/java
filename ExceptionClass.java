import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "tum bhi betichod";
    }

    @Override
    public String getMessage() {
        return "kya be bharwe";
    }

}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }

    }

}
