
import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int [] lx = new int[s.length()];
        
        for(int i=0;i<=s.length()-1;i++){

            
            int l =0;
            for(int j=i;j<=s.length()-2;j++){
                System.out.println("("+ "" +s.charAt(i) + "" + s.charAt(j) + ") ");
             if(s.charAt(i)!=s.charAt(j)){
                 System.out.print(s.charAt(i) + "" + s.charAt(j) + " ");
                 
                 lx[i]=++l;
                 System.out.println(lx[i]);
             }  else {
                 System.out.println("Nahi mila");
             }
             
         }
        
      }


     Arrays.sort(lx);
      return lx[s.length()-1];
   }
  
}


public class JavaNew {
    public static void main(String[] args) {
       String s  = "abcabcbb";
        Solution a = new Solution();
        System.out.println(a.lengthOfLongestSubstring(s));
    }
}
