import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int result = factorial(input);
        System.out.println(result);
        br.close();
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}