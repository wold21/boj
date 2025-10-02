import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 테스트 케이스 개수
        // 2 
        // 건물 개수, 건설순서 규칙 개수
        // 4 4 
        // 각 건물의 건설 시간
        // 10 1 100 10 
        // 연관 관계
        // 1 2 1번 후 2번
        // 1 3 1번 후 3번
        // 2 4 2번 후 4번
        // 3 4 3번 후 4번
        // 목표 건물
        // 4 

        // 건물 개수, 건설순서 규칙 개수
        // 8 8 
        // 각 건물의 건설 시간
        // 10 20 1 5 8 7 1 43
        // 연관 관계
        // 1 2 1번 후 2번
        // 1 3 1번 후 3번
        // 2 4 2번 후 4번
        // 2 5 2번 후 5번
        // 3 6 3번 후 6번
        // 5 7 5번 후 7번
        // 6 7 6번 후 7번
        // 7 8 7번 후 8번
        // 목표 건물
        // 7 

        String testInput = "2\n4 4\n10 1 100 10\n1 2\n1 3\n2 4\n3 4\n4\n8 8\n10 20 1 5 8 7 1 43\n1 2\n1 3\n2 4\n2 5\n3 6\n5 7\n6 7\n7 8\n7";
        BufferedReader br = new BufferedReader(new StringReader(testInput));
        int testCases = Integer.parseInt(br.readLine());

        for(int i=0; i< testCases; i++) {
            String[] into = br.readLine().split(" ");
            int buildingCnt = Integer.parseInt(into[0]);
            int ruleCnt = Integer.parseInt(into[1]);
            
            // 위상 정렬을 위한 그래프 초기화
            List<Integer>[] graph = new ArrayList[buildingCnt + 1];
            int[] indegree = new int[buildingCnt + 1];

            for(int j=0; j<=buildingCnt; j++) {
                graph[j] = new ArrayList<>();
            }
            // 각 건물의 건설 시간
            String[] buildTimeInput = br.readLine().split(" ");
            int[] buildTime = new int[buildingCnt + 1];
            for(int j=1; j<=buildingCnt; j++) {
                buildTime[j] = Integer.parseInt(buildTimeInput[j-1]);
            }

            // 건설 순서에 따른 진입 차수 계산
            for(int k=0; k<ruleCnt; k++) {
                String[] ruleInput = br.readLine().split(" ");
                int from = Integer.parseInt(ruleInput[0]);
                int to = Integer.parseInt(ruleInput[1]);
                // System.out.println("from: " + from + ", to: " + to);
                graph[from].add(to);
                indegree[to]++;
            }

            System.out.println("그래프 연결 후: " + Arrays.toString(graph));
            System.out.println("진입차수: " + Arrays.toString(indegree));


            int targetBuilding = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();
            int[] completionTime = new int[buildingCnt + 1];

            for(int j=1; j<=buildingCnt; j++) {
                if(indegree[j] == 0) {
                    queue.offer(j);
                    completionTime[j] = buildTime[j];
                }
            }
            while(!queue.isEmpty()){
                int current = queue.poll();
                // 현재 건물 완성 후 지을 수 있는 다음 건물들 확인
                for (int next : graph[current]) {
                    // DP 핵심 next 건물의 완성 시간 갱신
                    // 현재 건물 완성 시간 + 다음 건물 완성 시간
                    System.out.println("current: " + current + ", next: " + next);
                    int newTime = completionTime[current] + buildTime[next];
                    completionTime[next] = Math.max(completionTime[next], newTime);
                    // 첫번째 값은 11, 두번째 값은 110

                    indegree[next]--; // 진입 차수 감소

                    if(indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
            System.out.println("=== 결과 ===");
            System.out.println(targetBuilding + "번 건물 완성 시간: " + completionTime[targetBuilding]);
            System.out.println();
        }
    }
}

// completionTime은 DP의 메모제이션 테이블 역할을 함.
// 이전 문제였던 피보나치의 DP 테이블은 모두 계산을 하고 값을 찾았지만
// 이 문제는 위상 정렬로 문제를 풀어나가면서 건물의 완성 시간을 메모제이션 테이블을 기준으로 갱신해 나간다.