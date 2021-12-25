import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        int c = 0, d = 1;
        System.out.println("Enter number of terams");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.print("0  1  ");
        for (int i = 2; i < b; i++) {
            int f = c + d;
            System.out.print(f + "  ");
            c = d;
            d = f;

        }
    }

}
