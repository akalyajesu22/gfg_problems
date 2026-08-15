class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
       int n = arr.length;
       int min = arr[0];
       
       
       ArrayList<Integer> res = new ArrayList<>();
       
     for(int i=0;i<n;i++)
     {
            boolean flag = false;
         for(int j=i+1;j<n;j++)
         {
             if(arr[j] < arr[i])
             {
                    res.add(arr[j]);
                 flag  = true;
               break;
             }
           
            
         }
         if (!flag)
            {
                res.add(-1);
            }
            
     }
     return res;
    }
}