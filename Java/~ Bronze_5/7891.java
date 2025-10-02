import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=0; i<tc; i++){
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a + b);
        }
        
        br.close();
    }
}