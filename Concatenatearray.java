import java.util.*;
class Concatenatearray{
    public static int[]  getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i+n] = nums[i];
        }
        return ans;
}
public static void main(String[]args)
{
    int nums[] = {1,4,1,2};
    
    int res[] = getConcatenation(nums);
    System.out.print(Arrays.toString(res));
}
}