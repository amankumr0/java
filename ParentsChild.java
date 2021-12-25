class Parents {
    Parents() {
        System.out.println("I am in parent's constructor");
    }
}

class Child extends Parents {
    Child() {
        super();
        System.out.println("I am in child's constructor");
    }
}

public class ParentsChild {
    public static void main(String[] args) {
        new Child();
        System.out.println("I am in main");
    }

}
