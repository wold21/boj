import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] seat = br.readLine().split(" ");
        int k1 = Integer.parseInt(seat[0]);
        int k1Cnt = Integer.parseInt(seat[1]);
        int k2 = Integer.parseInt(seat[2]);
        int k2Cnt = Integer.parseInt(seat[3]);
        System.out.println((k1*k1Cnt) + (k2 * k2Cnt));
        br.close();
    }
}