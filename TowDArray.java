public class TowDArray {
    public static void main(String[] args) {
       int j=19;
        int [] a = new int[20];
        for(int i = 0; i<=19;i++)
        {
            a[i]=i*2;
            System.out.print(a[i]);
        }
        System.out.println(a[j]);
        try {
            System.out.println(a[j+1]); 
        } catch (Exception e) {
            System.err.println(e);
        }
        
       
       
       
       














       
       
       
        // int a [][]  =  {
        //                   {2,4,5},
        //                   {7,8,10},
        //                   {2,5,9},
        //                   {2,8,6,}
        //                 } ; 
        // for(int i=0;i<=3;i++) {
        //     for(int j=0;j<=2;j++)
        // System.out.print(a[i][j] + " ");
            
        //     System.out.println(" ");
        // }
        // System.out.println(a.length);
    }

    
}
