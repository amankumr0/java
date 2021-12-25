import java.util.Scanner;

class Operation {
    int square(int n){
        return n*n;
    }
}



public class HAS_relson {
Operation op; //aggeration
double pi =3.14;

double area(int radius){
    op = new Operation();
    int rsquare = op.square(radius);
    return pi*rsquare;
}
public static void main(String[] args) {
    HAS_relson a1 = new HAS_relson();
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();

    System.out.println(a1.area(5) + name);
}

    
}
