import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCases = Integer.parseInt(br.readLine());
        for(int i=1; i<=testCases; i++){
            String[] numbers = br.readLine().split(" ");
            Long a = Long.parseLong(numbers[0]);
            Long b = Long.parseLong(numbers[1]);
            bw.write((a + b) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}