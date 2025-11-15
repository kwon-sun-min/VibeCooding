package CodingTest.Array;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] list = new int[n][2];

        for (int i = 0; i < list.length; i++) 
        {
            list[i][0] = sc.nextInt();
        }

        for (int i = 0; i < list.length; i++) 
        {
            list[i][1] = sc.nextInt();
        }

        for (int i = 0; i < list.length; i++) 
        {
            if(list[i][0] == 1 && list[i][1] == 1)
            {
                System.out.println("D");
            }

            else if(list[i][0] == 1 && list[i][1] == 2)
            {
                System.out.println("B");
            }

            else if(list[i][0] == 1 && list[i][1] == 3)
            {
                System.out.println("A");
            }

            else if(list[i][0] == 2 && list[i][1] == 1)
            {
                System.out.println("A");
            }

            else if(list[i][0] == 2 && list[i][1] == 2)
            {
                System.out.println("D");
            }

            else if(list[i][0] == 2 && list[i][1] == 3)
            {
                System.out.println("B");
            }

            else if(list[i][0] == 3 && list[i][1] == 1)
            {
                System.out.println("B");
            }

            else if(list[i][0] == 3 && list[i][1] == 2)
            {
                System.out.println("A");
            }

            else if(list[i][0] == 3 && list[i][1] == 3)
            {
                System.out.println("D");
            }

            
            
        }


    }
    
}
