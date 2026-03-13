import java.util.*;
class Houseproblem{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
       String s = sc.nextLine();
        if(s.contains("HH"))
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
            s = s.replace('.','B');
           
        }
         System.out.println(s);
    }
}