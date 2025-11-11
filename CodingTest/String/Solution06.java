package CodingTest.String;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] list = sc.nextLine().toCharArray();
        int[] alpha = new int[26];


        for (int i = 0; i < list.length; i++) 
        {
            if(alpha[list[i] - 97]++ == 0)
            {
                System.out.print(list[i]);
            }
            
        }
    }
}
