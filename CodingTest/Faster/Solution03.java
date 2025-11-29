package CodingTest.Faster;

import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int max = 0;


        int[] list = new int[n];

        for (int i = 0; i < n; i++) 
        {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < list.length-l+1; i++)    
        {
            int[] subArray = new int[l];
            subArray = Arrays.copyOfRange(list, i, l+i);

            int sum = 0;
            for (int j = 0; j < subArray.length; j++) 
            {
                sum += subArray[j];
            }

            if(max < sum) max = sum;

        }

        System.out.println(max);
        sc.close();
    }
}
