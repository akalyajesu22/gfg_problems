public class Solution {
    public int longestSubarray(int[] arr, int k) {
     int longestlength = 0;
    for(int i=0;i<arr.length;i++)
    {
        int sum = 0;
        for(int j=i;j<arr.length;j++)
        {
            sum += arr[j];
            if(sum == k)
            {
                longestlength = Math.max(longestlength,j-i+1);
            }
        }
    }
    return longestlength;
    }
} {
    
}
