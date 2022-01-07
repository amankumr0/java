class Student {
    int roll;
    String name, course;
    float fee;

    Student(int roll, String name, String course) {
        this.roll = roll; // keyword "this" used when parameters and instance variable name is same
        this.name = name;
        this.course = course;
    }

    Student(int roll, String name, String course, float fee) {
        this(roll, name, course); // this() used to invoke any constructor or defult condtructor
        this.fee = fee;  // Rule: Call to this() must be the first statement in constructor.
    }                     // otherwise it will give a "Compile Time Error"

    public void display() {
        System.out.println(name + " " + roll + " " + course + " " + fee);
    }

}

public class Illusion_Of_This {
    public static void main(String[] args) {
        Student S1 = new Student(10, "Aman", "JAVA", 450.68f);
        Student S2 = new Student(11, "Abhishek", "JAVA", 450.68f);
        S1.display();
        S2.display();
    }

}
