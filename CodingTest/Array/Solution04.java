package CodingTest.Array;

import java.util.Scanner;

public class Solution04 {

    public static int[] fibo(int n)
        {
            int[] answer = new int[n];

            if(n >= 1)
            {
                answer[0] = 1;
            }

            if(n >= 2)
            {
                answer[1] = 1;
            }

            for (int i = 2; i < n; i++) 
            {
                answer[i] = answer[i-1] + answer[i-2];
            }

            return answer;
        }

    public static void main(String[] args)
    {
        Solution04 sol = new Solution04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x : sol.fibo(n))
        {
            System.out.print(x + " ");
        }
        
    }
}
