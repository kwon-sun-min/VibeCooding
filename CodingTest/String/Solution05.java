package CodingTest.String;
import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        int lp = 0;
        int rp = str.length() - 1;


        while(lp < rp)
        {

            char lchar = str.charAt(lp);
            char rchar = str.charAt(rp);


            if(Character.isAlphabetic(lchar) && Character.isAlphabetic(rchar))
            {
                str.setCharAt(rp, lchar);
                str.setCharAt(lp, rchar);
                lp++;
                rp--;
            }

            else if(!Character.isAlphabetic(lchar))
            {
                lp++;
            }

            else if(!Character.isAlphabetic(rchar))
            {
                rp--;
            }
        }

        System.out.println(str.toString());

    }
}
