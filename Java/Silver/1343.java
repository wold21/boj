import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder result = new StringBuilder();
        int count = 0;

        for(int i=0; i < line.length(); i++){
            char c = line.charAt(i);
            if(c == 'X'){
                count++;
            } else { // . 일때 쌓인 count 만큼 매핑해주고 . 추가
                if(count % 2 != 0) { //하나도 매핑이 안될때
                    System.out.println(-1);
                    return;
                }
                result.append("AAAA".repeat(count / 4));
                result.append("BB".repeat((count % 4) / 2));
                result.append(".");
                count = 0;
            }
        }
        if (count > 0) {
            if (count % 2 != 0) {
                System.out.println(-1);
                return;
            }
            result.append("AAAA".repeat(count / 4));
            result.append("BB".repeat((count % 4) / 2));
        }
        System.out.println(result);
        
        br.close();
    }
}   

// 다른 풀이
// String line = br.readLine().replace("XXXX", "AAAA").replace("XX", "BB");
// if(line.contains("X")) {
//     System.out.println(-1);
//     return;
// }
// System.out.println(line);