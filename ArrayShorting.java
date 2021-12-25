import java.util.Scanner;
public class ArrayShorting {
    public static void main(String[] args) {
        int c=0;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []a = new int[size];
        System.out.println("Fill the array with numbers");
        for(int i=0;i<size;i++) a[i]=sc.nextInt();
        System.out.println("Here is our shorted number in increasing order");
        for(int j=size; j>=0;j--)
        {
            for(int k=0;k<size-1;k++){
                if(a[k]>=a[k+1]){
                 c = a[k];
                 a[k]=a[k+1];
                 a[k+1]= c;
                }
             }
        }
        for(int h=0;h<size;h++) System.out.print(a[h] + " ");
    }
    
}
