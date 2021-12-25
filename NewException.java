import java.util.Scanner;

class NegativeRadiusException extends Exception {

    public NegativeRadiusException() {
        System.out.println("I am in constructor");
    }

    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class NewException {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0)
            throw new NegativeRadiusException();
        double area = Math.PI * r * r;
        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {

            double f = area(a);
            System.out.println(f);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
