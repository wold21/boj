import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String testInput = "2\n6\n22";
        BufferedReader br = new BufferedReader(new StringReader(testInput));
        
        int testCases = Integer.parseInt(br.readLine());
        int maxN = 40;

        long[][] dp = new long[maxN + 1][2];
        dp[0] = new long[]{1, 0};
        dp[1] = new long[]{0, 1};
        for (int i = 2; i <= maxN; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
        
    }
}

/** 
 * DP 문제로 그냥 피보나치 수열을 계속해서 계산하면 시간초과 및 메모리가 부족할 수 있다.
 * 답을 미리 구해놓고 해당 답에서 문제의 답을 도출하는 동적 프로그래밍 방식으로 풀어야했다.
 * 그냥 for문 돌렸다가 시간초과 났음....
 * */ 