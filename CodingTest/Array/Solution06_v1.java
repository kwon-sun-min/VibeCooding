package CodingTest.Array;

import java.util.Scanner;

public class Solution06_v1 {

    public static boolean prime(int n)
    {
        int[] nums = new int[n+1];

        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i*i <= n; i++) 
        {
            if(nums[i] == 0)
            {
                for (int j = i*i; j <= n; j+=i) 
                {
                    nums[j] = 1;
                }
            }
            
        }

        if(nums[n] == 1)
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];

        

        for (int i = 0; i < n; i++) 
        {
            StringBuilder str = new StringBuilder(sc.next()).reverse();
            list[i] = Integer.parseInt(str.toString());
        }

        for (int i = 0; i < list.length; i++) 
        {
            if(prime(list[i]))
            {
                System.out.print(list[i] + " ");
            }
            
        }


    }
    
}
