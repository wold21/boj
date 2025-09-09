import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            long result = calculator(M, N);
            System.out.println(result);
        }

        br.close();
    }
    public static long calculator(int n, int r) {
        if(n == 0 || r == 0) return 1;
        long result = 1;
        for(int i=1; i<=r; i++){
            result = result * (n - i + 1) / i;
        }
        return result;
    }
}
/** 
 * 이항계수 문제.
 * n개중 r개를 선택하는 경우의 수
 * 여기서는 M개중 N을 선택하는 문제다.
 * 공식은 nCr = n! / (r! * (n - r)!)
 * 팩토리얼의 연속이네...
 * 0! = 1인 걸 처음알았는데
 * 약속되어있다고 하는데 팩토리얼은 자연수를 대상으로 한 연산이라고 한다.
 * 그래서 기존 정의로는 0!를 정의 할 수 없었다. 자연수가 아니기에.
 * 5! = 5 * (5 - 1)!로 계산이 되는데 이때 1!를 예로 들면
 * 1! = 1 * (1 - 1)!이 성립되어야하고
 * 1! = 1 * 0!로 볼 수 있다, 이 식을 성립하기 위해서는
 * 0! = 1이 되어야한다.
 */ 