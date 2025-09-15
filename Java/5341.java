import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input;
        while((input = Integer.parseInt(br.readLine())) != 0) {
            System.out.println(recursive(input));
        }
        br.close();
    }
    public static  int recursive(int n){
        if(n <= 0) return 0;
        return n + recursive(n - 1);
    }
}