package CodingTest.Array;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n+1];
        int answer = 0;

        list[0] = 1;
        list[1] = 1;

        for (int i = 2; i*i <= n; i++) 
        {
            if(list[i] == 0)
            {
                for (int j = i*i; j <= n; j+=i) 
                {
                    list[j] = 1;
                }
            }
        }

        for (int i = 0; i < list.length; i++) 
        {
            if(list[i] == 0)
            {
                answer++;
            }
            
        }

        System.out.println(answer);
        

    }
    
}
