package CodingTest.Faster;

import java.util.Scanner;

public class Solution03_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] list = new int[n];
        int[] sublist = new int[l];
        int p = 0;
        int q = l;

        int max = 0;
        int sum = 0;


        for (int i = 0; i < list.length; i++) 
        {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < l; i++) 
        {
            sum += list[i];
        }

        if(max < sum) max = sum;

        for (int i = l; i < list.length; i++) 
        {
            if(max < sum) max = sum;
            sum += list[i];
            sum -= list[i-l];
        }


        System.out.println(max);
        


    }
    
}
