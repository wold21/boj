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

        int totalMinutes = time[0] * 60 + time[1];
        totalMinutes += cookingTime;

        int resultHour = totalMinutes / 60 % 24;
        int resultMinute = totalMinutes % 60;

        System.out.println(resultHour + " " + resultMinute);


        br.close();
    }
}