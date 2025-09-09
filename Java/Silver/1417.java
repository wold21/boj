import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int candidates = Integer.parseInt(br.readLine());
        int[] arrCandidates = new int[candidates];
        for (int i = 0; i < candidates; i++) {
            arrCandidates[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        while(true) {
            // while을 돌면서 0번 인덱스만 빼고 
            // 나머지 중에 큰 값을 --
            // 0번 인덱스에 ++ 해주는데
            // 만약 0번 인덱스가 다른 후보들의 값보다 크다면
            // while문 종료
            int maxIdx = 1;
            for(int i=1; i<candidates; i++){
                if(arrCandidates[i] > arrCandidates[maxIdx]) {
                    maxIdx = i;
                }
            }
            if(candidates == 1 || arrCandidates[0] > arrCandidates[maxIdx]) {
                break;
            }
            arrCandidates[0]++;
            arrCandidates[maxIdx]--;
            count++;
        }
        System.out.println(count);
        
        br.close();
    }
}