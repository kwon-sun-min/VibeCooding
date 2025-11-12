package CodingTest.String;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int lp = 0;
        int rp = str.length() - 1;

        while(lp < rp)
        {
            char lchar = str.charAt(lp);
            char rchar = str.charAt(rp);

            if(Character.isAlphabetic(rchar) && Character.isAlphabetic(lchar))
            {
                if(Character.toLowerCase(rchar) == Character.toLowerCase(lchar))
                {
                    lp++;
                    rp--;
                }

                else
                {
                    System.out.println("NO");
                    return;
                }

                
            }

            else if(!Character.isAlphabetic(rchar))
            {
                rp--;
            }

            else if(!Character.isAlphabetic(lchar))
            {
                lp++;
            }


        }

        System.out.println("YES");


        
    }
    
}
