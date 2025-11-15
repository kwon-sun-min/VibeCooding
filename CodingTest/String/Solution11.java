package CodingTest.String;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + ' ';
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) 
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                count++;
            }

            else
            {
                System.out.print(str.charAt(i));
                if(count != 1)
                {
                    System.out.print(count);
                }
                count = 1;
            }
        }

    }
    
}
