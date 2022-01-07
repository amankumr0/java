// { Driver Code Starts
    import java.util.*;
    class Replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Solution g=new Solution();
            g.convertFive(n);
        }
    }
    }// } Driver Code Ends
    
    
    
    /*Complete the function below*/
    class Solution{
        public static void convertFive(int n){
            int p=0,sum=0,r=0;
            int x=n;
            while(n!=0){
                n=n/10;
                p++;
            }
            int []f= new int[p];
            for(int j=0;j<p-1;j++){
                f[j]=x%10;
                x=x/10;
                r++;
            }
            
           for(int i=0;i<=r;i++){
               if(f[i]==0) f[i]=5;
               int l = (int) java.lang.Math.pow(10,i);
               sum = f[i]*l+sum;
               }
               System.out.println(sum);
           
    }
    }
