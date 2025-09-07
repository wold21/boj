import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int[] arr_b = Arrays.stream(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = arr_b.length - 1; i >= 0; i--) {
            int number = a * arr_b[i];
            System.out.println(number);
        }
        System.out.println(a * b);
        br.close();

        // 나는 이 방법이 떠올랐는데 자릿수로 곱하는 방법도 있다.
        // int one = b % 10;
        // int ten = (b % 100) / 10;
        // int hundred = b / 100;
        // System.out.println(a * one);
        // System.out.println(a * ten);
        // System.out.println(a * hundred);
        // System.out.println(a * b);
    }
}