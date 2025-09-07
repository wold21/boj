import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        Long a = Long.parseLong(numbers[0]);
        Long b = Long.parseLong(numbers[1]);
        Long c = Long.parseLong(numbers[2]);

        System.out.println(a + b + c);
        br.close();
    }
}