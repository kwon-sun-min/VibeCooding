package CodingTest.Faster;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nlist = new int[n];

        for (int i = 0; i < nlist.length; i++) 
        {
            nlist[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mlist = new int[m];

        for (int i = 0; i < mlist.length; i++) 
        {
            mlist[i] = sc.nextInt();
        }

        int[] Tlist = new int[n+m];

        int p = 0;
        int q = 0;
        int c = 0;

        while(c < n+m)
        {
            if(p < n && q < m)
            {
                if(nlist[p] <= mlist[q])
                {
                    Tlist[c++] = nlist[p++];
                }

                else if(nlist[p] >= mlist[q])
                {
                    Tlist[c++] = mlist[q++];
                }
            }

            else if(p >= n)
            {
                Tlist[c++] = mlist[q++]; 
            }

            else if(q >= m)
            {
                Tlist[c++] = nlist[p++];
            }

        }

        System.out.print(Arrays.toString(Tlist));
    }
    
}
