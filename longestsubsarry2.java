import java.util.HashMap;

public class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
     int maxlength = 0;
     int sum =0 ;
     for(int i=0;i<arr.length;i++)
     {
         sum += arr[i];
         if(sum == k)
         {
             maxlength = i+1;
         }
             if(map.containsKey(sum-k))
             {
                 int length = i - map.get(sum-k);
                 maxlength = Math.max(length,maxlength);
             }
             if(!map.containsKey(sum))
             {
                 map.put(sum,i);
             }
         
         
     }
     return maxlength;
    }
} {
    
}
