import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        String[] files = new String[tc];
        for(int i=0; i<tc; i++){
            files[i] = br.readLine();
        }

        int length = files[0].length();
        StringBuilder result = new StringBuilder();

        for(int j=0; j<length; j++){
            char c = files[0].charAt(j);
            boolean sameChar = true;

            for(int k=1; k<tc; k++){
                if(files[k].charAt(j) != c) {
                    sameChar = false;
                    break;
                }
            }
            if( sameChar ){
                result.append(c);
            } else {
                result.append("?");
            }
        }

        System.out.println(result.toString());

        br.close();
    }
}