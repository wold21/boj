import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int yearForBuddha = Integer.parseInt(br.readLine());
        System.out.println(yearForBuddha - 543);
        br.close();
    }
}