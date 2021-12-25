
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
    switch (name){
        case "Abhishek":
            System.out.println("you are very good boy");
            break;
        case "Shubham":
            System.out.println("he is outstanding");
            break;
        case "Aman":
            System.out.println("you are such a madharchodistic ");
        default:
            System.out.println("sahi se naam likh na madharchod");

    }

    }
}