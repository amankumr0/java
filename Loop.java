class Parent {
    void meth1(){
        System.out.println("I am in meth1 of parent");
    }
}

class child extends Parent{
    void math2(){
        System.out.println("I am in meth2");
    }
}

class child2 extends Parent{
    void meth3(){
        System.out.println("I am in meth3 of child 2");
    }
}
class grandchil extends child{
    void meth6(){
System.out.println("hello");
    }

}




public class Loop {
    public static void main(String[] args) {
      grandchil a1 = new grandchil();
      a1.meth1();
      a1.meth6();
      a1.math2();
      child a3 = new child();
      a3.math2();
    }
    
}
