package CodingTest.Array;

import java.util.Scanner;

public class Solution10 {

    public static int check(int[][] list, int n)
    {
        int answer = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i < list.length; i++) 
        {
            for (int j = 0; j < list.length; j++) 
            {
                boolean flag = true;

                for(int k = 0; k < 4; k++)
                {
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if(nx >= 0  && nx < n && ny >= 0 && ny < n && list[i][j] <= list[nx][ny])
                    {
                        flag = false;
                        break;
                    }
                }

                if(flag)
                {
                    answer++;
                }
                
            }
            
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] list = new int[n][n];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                list[i][j] = sc.nextInt();
            }
        }

        System.out.println(check(list, n));
    }
    
}
