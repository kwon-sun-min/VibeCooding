package CodingTest.Array;

import java.util.Scanner;

public class Solution06_v2{

    public static boolean check(int n)
    {
        for (int i = 2; i*i <= n; i++) 
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
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
            if(check(list[i]))
            {
                System.out.print(list[i] + " ");
            }
            
        }
    }
    
}
