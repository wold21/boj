import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        // 약수 구하는 문제
        // 최소 약수 최대 약수 곱하면 된다.
        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[0]);
        for(int i=1; i<nums.length; i++){
            int num = Integer.parseInt(nums[i]);
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        System.out.println(max * min);
        br.close();
    }
}