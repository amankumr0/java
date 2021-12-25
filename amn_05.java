
class PP extends TT{
    
}
@FunctionalInterface
interface MyInterface{
   public void raja();
    // void team();
}
class amit1 implements MyInterface{
@Override
   public void raja(){
    System.out.println("I am raja");
    // public void kumar() {
    //     System.out.println("Hello");
    // }
}
}
class Sum{
    @Deprecated
    public void sum(int a, int b){
        System.out.println(a+b);
    }
}


public class amn_05{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
      
        
      amit1 a = new amit1();
      a.raja();
      Sum j = new Sum();
      j.sum(5, 6);      
    }
    
}
