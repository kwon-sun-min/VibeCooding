package CodingTest.문자열;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) 
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();

        str = str.toUpperCase();
        s = s.toUpperCase();

        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i) == s.charAt(0))
            {
                count++;
            }
        }

        System.out.println(count);

    }
}