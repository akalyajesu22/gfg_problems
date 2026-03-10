import java.util.*;
class ReplaceGreatestele
{
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
       
        
        for(int i=0;i<n;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] > max)
                {
                    
                    max = arr[j];
                    
                }

            }
            if(i == n-1)
            {
            res[i] = -1;
            }
            else{
                res[i] = max;
            }

            }

        
        return res;
}
public static void main(String[]args)
{
    int arr[] = { 2,4,5,3,1,2};
    int ans[] = replaceElements(arr);
    System.out.print(Arrays.toString(ans));
}
}