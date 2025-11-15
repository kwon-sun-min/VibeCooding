package CodingTest.Array;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int max = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) 
        {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < list.length; i++) 
        {
            if(list[i] > max)
            {
                max = list[i];
                answer++;
            }
        }

        System.out.println(answer);
    }
    
}
