import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int zero = 0;
        int one = 0;
        char prev = input.charAt(0);

        if (prev == '0') {
            zero++;
        } else {
            one++;
        }
        for(int i=1; i < input.length(); i++){
            char current = input.charAt(i);
            
            if (current != prev) {
                if (current == '1') {
                    one++;
                } else {
                    zero++;
                }
                prev = current;
            }
        }
        System.out.println(Math.min(zero, one));

        br.close();
    }
}