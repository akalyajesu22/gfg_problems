import java.util.*;
class paritybinarybit{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for(int i=0;i<N;i++)
        {
            int num = A[i];
            int count = 0;
            while(num > 0)
            {
            if(num % 2 == 1)
            {
                count++;
            }
            num = num / 2;
        }
        if(count % 2 == 0)
        {
            System.out.print(A[i] + " ");
        }
    }

    for(int i=0;i<N;i++)
    {
        int num = A[i];
        int count = 0;
        while(num > 0)
        {
            if(num % 2 == 1)
            {
                count++;
            }
            num = num / 2;
        }
        if(count % 2 != 0)
        {
            System.out.print(A[i] + " ");
        }
    }
}
}