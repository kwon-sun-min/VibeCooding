package CodingTest.Array;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) 
        {
            list[i] = sc.nextInt();
        }


        for (int i = 0; i < list.length; i++) 
        {
            int rank = 1;

            for (int j = 0; j < list.length; j++) 
            {
                if(list[i] < list[j])
                {
                    rank++;
                }
                
            }
            System.out.print(rank + " ");            
        }
    }
    
}
