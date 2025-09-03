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