import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String targetNum = br.readLine();
        if(targetNum.length() == 1) {
            targetNum = "0" + targetNum;
        }
        String paramNum = targetNum;

        int cnt = 1;
        while(true){
            paramNum = returnToMe(paramNum);
            if(paramNum.equals(targetNum)){
                break;
            }
            cnt++;
        }
        
        System.out.println(cnt);

        br.close();
    }

    public static String returnToMe(String input){
        if(input.length() == 1) {
            input = "0"+input;
        }
        //01
        int a = input.charAt(0) - '0';
        int b = input.charAt(1) - '0';
        int addNum = a + b;
        String result = String.valueOf(b) + String.valueOf(addNum % 10);
        return result;
    }
}
