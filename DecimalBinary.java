import java.util.Scanner;

public class DecimalBinary{
    public static void main(String[] args) {
        System.out.println("For convert into Binary select 1 \nFor convert into Decimal select 2");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //This is for coversion of Decimal into Binary
        switch (a) {
            case 1:
            System.out.println("Enter Decimal number");
            int b = sc.nextInt();
            intoBinary(b);
            break;
            case 2:
            System.out.println("Enter Binary number");
            int c = sc.nextInt();
            int decimal = intoDecimal(c);
            System.out.println(decimal);
            break;
            default: System.out.println("Please select a valid option");
            break;
        }
        
    }

    private static int intoDecimal(int c) {

        return 0;
    }
//function for converting into Binary************
    private static void intoBinary(int b) {
        int d =0,c=0;
        int z=b;
       for (int i=0; i<b ;d++) {
            b=b/2;
            c++;
         }
         int []f= new int[d];
         for (int e=0;e<d;d--) {
           f[d-1]= z%2;
           z=z/2;
        }
     for(int j=0;j<c;j++)  System.out.print(f[j]);
    }
}