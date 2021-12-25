class Animal{
    static String name = "Dog";

   static int sum(){
    name = "Cat";
        return 5;
    }
    
}


public class FunctionChp {



static{
    System.out.println("I am in static block");
}


    public static void main(String[] args) {
        synchronized(){
            
        }
        Animal a1 = new Animal();
        int z = a1.sum();
Animal.sum();
        // int a = sum(5,8);
        // int b = sub2(11, 8);
        
      
        System.out.println(a + " " + b + " " + z + " " + d);
    }
    
}



