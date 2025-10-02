import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();
        StringBuilder result = new StringBuilder();

        for(char c : arr.toCharArray()){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        System.out.println(result);
        br.close();
    }
}