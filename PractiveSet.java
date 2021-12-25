import java.util.Scanner;

abstract class Person1 {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    abstract int cheakAge(int i);
}

class Voter extends Person1 {
    @Override
    int cheakAge(int a) {
        if (a >= 18)
            System.out.println(name + " is able to vote and The age is:" + a);
        else {
            System.out.println(name + " is not able to vote");
        }
        return a;
    }
}

class Student extends Person1 {
    public Student() {
        System.out.println("i am in constructor");
    }

    int cheakAge(int c) {
        if (c >= 17)
            System.out.println(name + " is able to vote & voter's age is:" + c);
        else
            System.out.println(name + " is not able to vote");
        return c;

    }
}

public class PractiveSet {
    public static void main(String[] args) {

        System.out.println("If you are a student Press 1 else Press 2");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        if (z == 1) {
            System.out.println("Enter your name");
            Student a1 = new Student();
            System.out.println("Enter your age");
            Scanner sc2 = new Scanner(System.in);
            int g = sc2.nextInt();
            a1.cheakAge(g);
        }
        if (z == 2) {
            System.out.println("Enter your name");
            Voter v1 = new Voter();
            System.out.println("Enter your age");
            Scanner sc1 = new Scanner(System.in);
            int h = sc1.nextInt();
            v1.cheakAge(h);
        } else {
            System.out.println("Choose correct option");
        }
    }

}
