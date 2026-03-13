import java.util.*;
class Contestproblem{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
          int greencost = sc.nextInt();
          int purplecost = sc.nextInt();

          int n = sc.nextInt();
          int p1count = 0;
          int p2count = 0;
          for(int i=0;i<n;i++)
          {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            if(p1 == 1)
            {
                p1count++;
            }
            if(p2 == 1)
            {
                p2count++;
            }
            int cost1 = p1count * greencost + p2count * purplecost;
            int cost2 = p2count * purplecost + p1count * greencost;
          System.out.print(Math.min(cost1,cost2));
          }
          t--;



        }
    }
}