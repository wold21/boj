import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] time = new int[2];
        time[0] = Integer.parseInt(input[0]);
        time[1] = Integer.parseInt(input[1]);

        if(time[1] - 45 < 0) {
            time[0] -= 1;
            time[1] = 60 + (time[1] - 45);
        } else {
            time[1] -= 45;
        }

        if(time[0] < 0) {
            time[0] = 24 + time[0];
        }

        System.out.println(time[0] + " " + time[1]);


        br.close();
    }
}