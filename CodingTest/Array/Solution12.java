package CodingTest.Array;

import java.util.Scanner;

public class Solution12 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                int count = 0;
                if(i == j) continue;

                for(int k = 0; k < m; k++)
                {
                    int Idx = 0;
                    int Jdx = 0;

                    for(int s = 0; s < n; s++)
                    {
                        if(arr[k][s] == i) Idx = s;
                        if(arr[k][s] == j) Jdx = s;
                    }

                    if(Idx < Jdx) count++;
                }

                if(count == m) answer++;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}