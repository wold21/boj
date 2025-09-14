import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for(int i=0; i<5; i++){
            int input = Integer.parseInt(br.readLine());
            result = result + input;
        }
        System.out.println(result);
        br.close();
    }
}