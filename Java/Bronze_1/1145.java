import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int cnt = 1;
        while(true){
            int answer = 0;
            for(int i=0; i<input.length; i++){
                int num = Integer.parseInt(input[i]);
                if(cnt % num == 0){
                    answer++;
                }
            }
            if(answer >= 3) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}