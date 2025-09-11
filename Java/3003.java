import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] pieces = br.readLine().split(" ");
        int[] pieces_count = {1, 1, 2, 2, 2, 8};
        StringBuilder result = new StringBuilder();
        for(int i=0; i<pieces.length; i++){
            int piece = Integer.parseInt(pieces[i]);
            result.append(pieces_count[i] - piece);
            if(i == pieces_count.length - 1) {
                result.append(" ");
            } 
        }
        System.out.println(result);
        br.close();
    }
}
// StringJoiner 방법도 있음.
// 특정한 문자를 미리 넣을 수도 있는 듯