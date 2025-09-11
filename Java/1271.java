import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        BigInteger money = new BigInteger(input[0]);
        BigInteger divide = new BigInteger(input[1]);
        BigInteger result = money.divide(divide);
        BigInteger mod = money.remainder(divide);
        System.out.println(result);
        System.out.println(mod);
        br.close();
    }
}