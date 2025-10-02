import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int firstNum = Integer.parseInt(input[0]);
        int secondNum = Integer.parseInt(input[1]);
        int thirdNum = Integer.parseInt(input[2]);

        if(firstNum == secondNum && secondNum == thirdNum) {
            System.out.println(10000 + firstNum * 1000);
        } else if(firstNum == secondNum || firstNum == thirdNum) {
            System.out.println(1000 + firstNum * 100);
        } else if(secondNum == thirdNum) {
            System.out.println(1000 + secondNum * 100);
        } else {
            System.out.println(Math.max(Math.max(firstNum, secondNum), thirdNum) * 100);
        }

        br.close();
    }
}