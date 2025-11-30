package CodingTest.Faster;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int m = sc.nextInt();

        int answer = 0;
        int sum = 0;
        int p = 0;

        for (int i = 0; i < list.length; i++) 
        {
            list[i] = sc.nextInt();
        }

        
        for (int i = 0; i < list.length; i++) 
        {
            sum += list[i];
            
            while(sum > m)
            {
                sum -= list[p++];
            }

            if(sum == m) answer++;
        }

        System.out.println(answer);




    }
    
}
