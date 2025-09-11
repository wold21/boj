import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int addNum = 0;
        for(int i=0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            addNum = addNum + (int) Math.pow(number, 2);
        }
        System.out.println(addNum % 10);
        br.close();
    }
}