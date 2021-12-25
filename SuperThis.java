class RR{
    int l = 5;
    static int p = 7;
    RR(){
        int l = 100;
        System.out.println("Hello" + l);
    }
    int a = 5;
    }
    class PP extends  RR{
     PP(){
         super();
     }
        int a = 6;
        void raja(){
            System.out.println("I am in PP " + this.a );
            System.out.println(" I am in PP " + super.a);
        }
    }

public class SuperThis {
    SuperThis(){
        System.out.println("I am in SuperThis");
    }
   
    public static void main(String[] args) {
       
      SuperThis d1 = new SuperThis();
      
PP a5 = new PP();
a5.raja();

    }
}
