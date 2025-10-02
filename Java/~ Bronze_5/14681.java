import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        // 둘다 양수면 1
        // x만 음수면 2
        // 둘다 음수면 3
        // y만 음수면 4
        if(a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b < 0) {
           System.out.println(3);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a > 0 && b < 0) {
            System.out.println(4);
        }
        br.close();
    }
}