class Student1{
    int roll_no;
    String name;
    private static String college_name= "BCET";

    Student1(int i,String b){
        name =b;
        roll_no = i;
    }
    void display(){
        System.out.println(name + " " + roll_no  + " " + college_name);
    }
}

public class Static_Keyword {
    public static void main(String[] args) {
        
        Student1 a1 = new Student1(190, "Aman");
        Student1 a2 = new Student1(155, "Shubham");
        a1.display();
        a2.display();
    }
    
}
