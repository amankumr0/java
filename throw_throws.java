import java.util.Scanner;

public class throw_throws {
    public static double aman() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int e = sc1.nextInt();
        double result = f / e;
        return result;

    }

    public static void main(String[] args) {

        try {
            double d = aman();
            System.out.println(d);
        } catch (Exception g) {
            System.out.println("There is some unaccetable data given, Please give correct data.");
            // System.out.println(g.toString());
            double d = aman();
            System.out.println(d);

        }
    }
}
