package CodingTest.String;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        int p = 1000;

        int[] Larr = new int[s.length()];
        int[] Rarr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == t)
            {
                p = 0;
                Larr[i] = p;
            }

            else
            {
                Larr[i] = ++p;
            }
        }

        p = 1000;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            if(s.charAt(i) == t)
            {
                p = 0;
                Rarr[i] = p;
            }

            else
            {
                Rarr[i] = ++p;
            }
        }


        for (int i = 0; i < s.length(); i++) 
        {
            System.out.print(Math.min(Larr[i], Rarr[i]) + " ");
        }

    }
    
}
