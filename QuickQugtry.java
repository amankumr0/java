import java.util.Scanner;

public class QuickQugtry {
    public static int[] marks = { 1, 2, 3 };

    public static void main(String[] args) {
        tery(marks);

    }

    public static void tery(int[] marks) {
        try {
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter index of Array You Want Print");
            int ind = scn.nextInt();

            System.out.println(marks[ind]);
        } catch (Exception e) {
            System.out.println("Soory error Try again");
            tery(marks);
        }

    }

}