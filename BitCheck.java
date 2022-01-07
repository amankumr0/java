

public class BitCheck extends Object{
    @Override
    public String toString(){
        return "Chal ve laure";
    }
    private void name() {
        System.out.println("Naam kya hai tumahara");
    }
    public static void main(String[] args) {
        BitCheck a1 = new BitCheck();
        BitCheck obj = new BitCheck();
        System.out.println(a1.toString());
      
        int a = 55006,sum=0,z=0;
        int t=a;
        while(t!=0){
            t=t/10;
            z++;
        }
        int [] f = new int [z];
        for (int i=0; i<z ;i++) {
            f[i] = a%10;
            // System.out.println(a);
             a =a/10;
             if(f[i]==0){ f[i]=5;}
             int l = (int) java.lang.Math.pow(10, i);
             
                sum =  f[i]*l+sum;
             System.out.println(sum);
        }
       
    }
}