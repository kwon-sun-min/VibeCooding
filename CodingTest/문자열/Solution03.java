package CodingTest.문자열;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String max = "";
        String[] line = str.split(" ");

        for (int i = 0; i < line.length; i++) 
        {
            if(max.length() < line[i].length())
            {
                max = line[i];
            }
        }

        System.out.println(max);


        
    }
    
}
