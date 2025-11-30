package CodingTest.Faster;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        int lt = 1;
        int rt = 2;
        int sum = 3;


        while(rt <= n/2+1)
        {
            if(sum < n)
            {
                rt += 1;
                sum += rt;
            }

            else if(sum > n)
            {
                sum -= lt;
                lt += 1;
            }

            else if(sum == n)
            {
                rt += 1;
                sum += rt;
                answer++;

            }
            
        }

        System.out.println(answer);
        sc.close();
    }
    
}
