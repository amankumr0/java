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
            intoDecimal(c);
            break;
            default: System.out.println("Please select a valid option");
            break;
        }
        
    }

    private static void intoDecimal(int c) {
        int d =0,g=0,h=0;
        int z=c;
        for (int i=0; i<c ;d++) {
            c=c/10;
            g++;
         }
        int []f= new int[d];
        for (int e=0;e<d;d--) {
           f[d-1]= z%10;
           z=z/10;
        }
        h=f[0]*1;
        for(int j=0;j<g-1;j++){
        h=(2<<j*f[j+1])+h;
        }
        System.out.println(h);
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
           z=z>>1;
        }
     for(int j=0;j<c;j++)  System.out.print(f[j]);
    }
}