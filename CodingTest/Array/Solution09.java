package CodingTest.Array;

import java.util.Scanner;

public class Solution09 {
    public static int width(int[][] list, int max)
    {
        for (int i = 0; i < list.length; i++) 
        {
            int sum = 0;

            for (int j = 0; j < list.length; j++) 
            {
                sum += list[i][j];
            }
            
            if(max < sum)
            {
                max = sum;
            }
            
        }

        return max;
    }


    public static int height(int[][] list, int max)
    {
        for (int i = 0; i < list.length; i++) 
        {
            int sum = 0;

            for (int j = 0; j < list.length; j++) 
            {
                sum += list[j][i];
            }

            if(max < sum)
            {
                max = sum;
            }
        }
        return max;
    }

    public static int Lcross(int[][] list, int max)
    {
        int sum = 0;

        for (int i = 0; i < list.length; i++) 
        {
            sum += list[i][i];
        }

        if(max < sum)
        {
            max = sum;
        }
        return max;
    }

    public static int Rcross(int[][] list, int max)
    {
        int sum = 0;
        
        for (int i = 0; i < list.length; i++) 
        {
            sum += list[i][list.length-i-1];
        }

        if(max < sum)
        {
            max = sum;
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] list = new int[n][n];
        int max = 0;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                list[i][j] = sc.nextInt();
            }
        }

        max = width(list, max);
        max = height(list, max);
        max = Lcross(list, max);
        max = Rcross(list, max);

        System.out.println(max);








        
    }
    
}
