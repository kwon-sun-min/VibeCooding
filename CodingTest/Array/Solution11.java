import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int answer = 0;

        // i번 학생을 기준으로 순회
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            // j번 학생과 비교
            for (int j = 0; j < n; j++) {
                // k학년 때 같은 반이었는지 확인
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; // 한 번이라도 같은 반이었으면 카운트하고 다음 학생으로 넘어감
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1; 
            }
        }
        System.out.println(answer);
        sc.close();
    }
    
}
