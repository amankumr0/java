import java.util.Scanner;
import java.lang.Math;


public class Armstrong{
    static boolean IsArmstrong(int n){
        int temp, sum=0, last,digit=0;
    temp = n;
    while(temp>0){
        temp=temp/10;
        digit++;
    }
    temp =n;
    while(temp>0){
        last = temp%10;
        sum +=  (Math.pow(last,digit));
        temp = temp/10;
    }
    if(sum==n)
    return true;
    else return false;
    
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if( IsArmstrong(b))
        System.out.println(b + " is an Armstrong number");
        else
        System.out.println(b + " is not an Armstrong number");
    }
}