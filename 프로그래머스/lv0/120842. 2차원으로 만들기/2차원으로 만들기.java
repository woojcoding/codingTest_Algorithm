import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {    
        int[][] answer = new int[num_list.length / n][n];
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int num : num_list) {
            q.offer(num);
        }
        
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = q.poll();
            }
        }
        
        return answer;
    }
}