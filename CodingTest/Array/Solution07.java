package CodingTest.Array;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) 
        {
            list[i] = sc.nextInt();
        }

        int score = 0;
        int answer = 0;

        for (int i = 0; i < list.length; i++) 
        {
            if(list[i] == 0)
            {
                score = 0; 
            }

            else
            {
                score++;
            }

            answer += score;
            
        }

        System.out.println(answer);
    }
    
}
