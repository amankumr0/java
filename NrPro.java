import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j=0;
        for (i=0;i<=nums.length-2; i++) {
            
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i+1];
                if(nums[i]==nums[nums.length-1]){
                    j=i;
                    break;
                }
            }
            
        }
            
       return j+1; 
        
    }
}
public class NrPro{
    public static void main(String[] args) {
        int [] a = {0,0,1,1,1,2,2,3,3,4};
        Solution a1 = new Solution();
        int l = a1.removeDuplicates(a);
        System.out.println(l);
    }
}
