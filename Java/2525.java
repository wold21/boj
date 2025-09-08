import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] time = new int[2];
        time[0] = Integer.parseInt(input[0]);
        time[1] = Integer.parseInt(input[1]);

        int cookingTime = Integer.parseInt(br.readLine());

        int upHour = time[1] + cookingTime % 60;
        int resultsHour = time[0] + cookingTime;
        if (resultsHour) {

        }
        // System.out.println(time[0] + " " + time[1]);


        br.close();
    }
}