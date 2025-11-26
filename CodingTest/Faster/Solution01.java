package CodingTest.Faster;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> Nlink = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) 
        {
            Nlink.add(sc.nextInt());
        }


        int m = sc.nextInt();
        LinkedList<Integer> Mlink = new LinkedList<Integer>();

        for (int i = 0; i < m; i++) 
        {
            Mlink.add(sc.nextInt());
        }

        LinkedList<Integer> Tlink = new LinkedList<Integer>();

        Tlink.addAll(Nlink);
        Tlink.addAll(Mlink);

        System.out.println(Tlink.toString());

        Collections.sort(Tlink);

        System.out.println(Tlink.toString());
        sc.close();

        
    }
    
    
}
