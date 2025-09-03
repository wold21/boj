import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String testInput = "3\n0 0 13 40 0 37\n0 0 3 0 7 4\n1 1 1 1 1 5";
        BufferedReader br = new BufferedReader(new StringReader(testInput));
        int testCases = Integer.parseInt(br.readLine());

        String line;
        while ((line = br.readLine()) != null) {
            String[] numbers = line.split(" ");

            int x1 = Integer.parseInt(numbers[0]);
            int y1 = Integer.parseInt(numbers[1]);
            int r1 = Integer.parseInt(numbers[2]);

            int x2 = Integer.parseInt(numbers[3]);
            int y2 = Integer.parseInt(numbers[4]);
            int r2 = Integer.parseInt(numbers[5]);

            // 각 원의 유클리드 거리 계산
            int x = x1 - x2;
            int y = y1 - y2;
            int distance = (int) Math.sqrt(x * x + y * y);

            // 두 원의 반지름의 합과 차
            int radiusSum = r1 + r2;
            int radiusDiff = Math.abs(r1 - r2); // 절대값 처리

            if (distance == 0 && r1 == r2) {
                System.out.println(-1); // 무한대임
            } else if (distance > radiusSum || distance < radiusDiff) { // 두 좌표의 거리가 반지름의 거리보다 크거나 거리가 반지름의 차보다 작을때는 원이 만나지 않음.
                System.out.println(0);
            } else if (distance == radiusSum || distance == radiusDiff) { // 두 원이 외접하거나 내접할 때
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        
    }
}

/**
 * 문제 이해하는데 시간이 좀 걸렸던 문제.
 * 마린의 위치를 찾으라길래 모든 위치에 대해서 구하는 줄 알았는데 
 * 마린을 공격할 수 있는 각 터렛이 서로 얼마나 겹쳐있는지에 대한 문제였다.
 * 교점을 구하는 문제로 만약 각 터렛이 동일한 조건이라면 -1을 출력하면 됐었다.
 * 이때 유클리드 거리계산 하는 법을 배웠다. (피타고라스 정의에 의한 거리계산)
 */

