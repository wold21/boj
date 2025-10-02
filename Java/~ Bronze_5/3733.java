import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null) {
            String[] input = line.split(" ");
            int person = Integer.parseInt(input[0]);
            Long stuff = Long.parseLong(input[1]);
            System.out.println(stuff / (person + 1));
        }
        br.close();
    }
}