import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (i=0;i<nums.length-2; i++) {
            
            if(nums[i]==nums[i+1]){
                nums[i+1]=nums[i+2];
            }
            if(nums[i]==nums[nums.length-1]){
                
                break;
                
            }
        }
          for(int j =0;j<nums.length-1;j++) System.out.print(nums[j]);  
       return i+1; 
        
    }
}

public class lkjh {
    public static void main(String args[]) {
     int [] a = {1,1,2,5,6,7,5,6,7};
    
     Arrays.sort(a);
     for (int i =0;i<a.length;i++) {
        System.out.print( a[i]); 
     }
     Solution a1 = new Solution();
     int b = a1.removeDuplicates(a);
        System.out.println(b);
    
     
    
}
}