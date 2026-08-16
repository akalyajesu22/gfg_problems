
class Solution {
    public boolean isSubset(int a[], int b[]) {
     HashMap<Integer,Integer> map = new HashMap<>();
  
     
     for(int num : a)
     {
         map.put(num,map.getOrDefault(num,0)+1);
     }
     for(int num : b)
     {
       int count =   map.getOrDefault(num,0);
     
     if(count == 0)
     {
         return false;
     }
     map.put(num,count-1);
     }
     return true;
    }
}