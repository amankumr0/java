import java.util.Scanner;

public class AdvCalc {
   static void cal(int a, int b){
        System.out.println("For Multiple Press --> m \nFor Addition Press --> a \nFor Substraction Press --> s \nFor Division Press --> d");
        Scanner sc1 = new Scanner(System.in);
        String p = sc1.next();
        switch (p) {
            case "m","M":
                System.out.println(a*b);
                break;
                case "a","A":
                System.out.println(a+b);
                break;
                case "s","S":
                System.out.println(a-b);
                break;
                case "d","D":
                try {
                    System.out.println(a/b);
                } catch (Exception e) {
                    System.out.println("Invalid operation");
                }
                break;
                default:
            System.out.println("Use valid option");
            cal(a,b);
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome in Advance calculator");
        System.out.println("Enter Two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        cal(a,b);
    }
}
