package CodingTest.String;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList();

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) 
        {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < list.size(); i++) 
        {
            String word = new StringBuilder(list.get(i)).reverse().toString();
            System.out.println(word);
        }


       
    }
    
}
