import java.util.Scanner;

public class WithArray {

    public static void marks(int[] getMark) {
        System.out.println("Enter Index Array you want to print");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            System.out.println(getMark[a]);
        } catch (Exception e) {
            System.out.println("Sorry Index is out of bound plzz retry");
            marks(getMark);
        }
    }

    public static void main(String[] args) {
        int[] getMark = { 59, 70, 80, 81 };
        marks(getMark);

    }

}
