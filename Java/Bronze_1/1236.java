import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        char[][] colRow = new char[row][col];
    
        for(int i=0; i<row; i++){
            String line = br.readLine();
            for(int j=0; j<col; j++){
                colRow[i][j] = line.charAt(j);
            }
        }  
        // 행과 열 모두 x가 없는 것을 찾고 그 중 큰 값을 답으로 제출.
        int rowCnt = 0;
        for(int i=0; i<row; i++){
            boolean xMark = false;
            for(int j=0; j<col; j++){
                char c = colRow[i][j];
                if(c == 'X'){
                    xMark = true;
                    break;
                }
            }
            if(!xMark){
                rowCnt++;
            }
        }

        int colCnt = 0;
        for(int i=0; i<col; i++){
            boolean xMark = false;
            for(int j=0; j<row; j++){
                char c = colRow[j][i];
                if(c == 'X'){
                    xMark = true;
                    break;
                }
            }
            if(!xMark){
                colCnt++;
            }
        }
        System.out.println(Math.max(rowCnt, colCnt));

        br.close();
    }
}