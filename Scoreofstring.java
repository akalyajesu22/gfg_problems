import java.util.*;
class Scoreofstring{
    

    public static  int scoreOfString(String s) {
        int sum = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
            sum = sum + diff;
        }
        return sum;
    }
    public static void main(String[]args)
    {
      String s  = "code";
      int res = scoreOfString(s);
      System.out.print(res);
    }
}


