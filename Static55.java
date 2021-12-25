class Bank{
    float getRateOfIntrest(){
        return 0;   
    }

}
class SBI extends Bank{
    float getRateOfIntrest(){
    return 4.5f;
    }
}
class ICICI extends Bank{
    float getRateOfIntrest(){
        return 5.6f;
    }
}
class BOB extends Bank{
    float getRateOfIntrest(){
        return 7.2f;
    }
}

public class Static55 {
  public static void main(String[] args) {
     Bank A = new SBI();
     Bank b = new ICICI();
     Bank C = new BOB();
     System.out.println("IVO SBI" + A.getRateOfIntrest() + "     IVO ICICI" + b.getRateOfIntrest() + "       IVO BOB" + C.getRateOfIntrest()); 
  }
    
}
