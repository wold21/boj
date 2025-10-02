import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if(a == 0 && b == 0) break;

            if(a > b){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
        br.close();
    }
}