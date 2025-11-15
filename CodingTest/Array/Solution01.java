package CodingTest.Array;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            list[i] = sc.nextInt();
        }

        System.out.print(list[0] + " ");

        for (int i = 0; i < list.length-1; i++) 
        {
            if(list[i] < list[i+1])
            {
                System.out.print(list[i+1] + " ");
            }
        }

    }
    
}
