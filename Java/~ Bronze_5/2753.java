import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        // 윤년 4의 배수면서 100의 배수가 아닐 때 또는 400의 배수일 때
        // 윤년이면 1 아니면 0 출력
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}