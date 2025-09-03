import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2 -5 1 12 1 7 1 1 8 -3 -1 1 2 2 2 5 5 1 -4 5 1 12 1 1 12 1 2 -5 1 5 1 1 0 0 2
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < length; i++) {
            String[] question_info = scanner.nextLine().split(" ");

            int start_x = Integer.parseInt(question_info[0]);
            int start_y = Integer.parseInt(question_info[1]);
            int end_x = Integer.parseInt(question_info[2]);
            int end_y = Integer.parseInt(question_info[3]);
            
            int planetsCnt = scanner.nextInt();
            scanner.nextLine();

            int result = 0;
            for (int j = 0; j < planetsCnt; j++) {
                // 행성의 좌표에 따른 둘레가 출발지점 혹은 도착지점을 포함한다면 카운트를 세지 않고,
                // 둘중에 하나라도 행성 안에 포함되지 않으면 카운트를 센다.
                
                // 먼저 행성의 좌표와 반지름을 받는다.
                String[] planets_input = scanner.nextLine().split(" ");
                int planet_x = Integer.parseInt(planets_input[0]);
                int planet_y = Integer.parseInt(planets_input[1]);
                int planet_r = Integer.parseInt(planets_input[2]);
                boolean isStartInPlanet = isInPlanet(start_x, start_y, planet_x, planet_y, planet_r);
                boolean isEndInPlanet = isInPlanet(end_x, end_y, planet_x, planet_y, planet_r);

                if (isStartInPlanet ^ isEndInPlanet) {
                    result++;
                }
            }
            System.out.println(result);
        }

        scanner.close();
    }

    public static boolean isInPlanet(int x, int y, int planet_x, int planet_y, int planet_r) {
        // 유클리드 거리 계산
        int dx = x - planet_x;
        int dy = y - planet_y;
        int distance = (int) Math.sqrt(dx * dx + dy * dy);
        boolean isIn = distance < planet_r;
       return isIn;
    }
}

