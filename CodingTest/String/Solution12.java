package CodingTest.String;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String line = "";

        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i) == '#')
            {
                line += '1';
            }

            else if(str.charAt(i) == '*')
            {
                line += '0';
            }
            
            if(line.length() == 7)
            {
                System.out.println((char)Integer.parseInt(line, 2));
                line = "";
            }
        }
    }
    
}
