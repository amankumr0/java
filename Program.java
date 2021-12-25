public class Program {
   
    public static void main(String[] args) {
        int p=0;
        for(int i =5;i>=0;i--){
            int c = i-1;
            for(int j=1;j<=c;j++){

                
                System.out.print(" ");
               }
            for(int z=1;z<=p; z++){
                System.out.print("*");
                }
                System.out.println("");
                p=(2*p+1);
            
        }
    }
}
