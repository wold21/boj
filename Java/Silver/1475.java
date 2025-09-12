import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 같은 숫자가 몇개인지 세면 될 것 같은데 6이나 9는 2개로 보면됨.
        // 예를 들면 966이면 3셋트가 아니라 2세트로도 충분함.
        int[] count = new int[10];
        for(int i=0; i<input.length(); i++){
            int digit = input.charAt(i) - '0';
            count[digit]++;
        }
        int sixNine = (count[6] + count[9] + 1) / 2;
        count[6] = sixNine;
        count[9] = sixNine;
        
        int maxCount = count[0];
        for(int i=1; i<count.length; i++){
            if(maxCount < count[i]){
                maxCount = count[i];
            }
        }
        System.out.println(maxCount);
        br.close();
    }
}