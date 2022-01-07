import java.lang.reflect.Array;
import java.util.Scanner;
public class ArraySorting {
	public static void main(String[] args) {
       
		String [] ab = args;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []a = new int[size];
        
		System.out.println("Fill the array with numbers");
		for(int i=0;i<size;i++) a[i]=sc.nextInt();
		System.out.println("Here is our sorted number in increasing order");
       
        int [] b = ArraySorting.sorting(a);
		for(int h=0;h<size;h++) System.out.print(b[h] + " ");
    }

    private static int [] sorting(int [] arr) {
        int a = Array.getLength(arr);
        int c=0;
        for(int j=a; j>=0;j--)
		{
			for(int k=0;k<a-1;k++){
				if(arr[k]>=arr[k+1]){
				 c = arr[k];
				 arr[k]=arr[k+1];
				 arr[k+1]= c;
				}
			 }
		}
        return arr;
        }
	
}
