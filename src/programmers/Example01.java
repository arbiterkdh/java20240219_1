package programmers;

import java.util.*;

public class Example01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));


    }


}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] current = new int[N + 1];

        for (int player : stages) {
            current[player]++;
        }

        int reached = 0;
        Map<Double, Integer> failureRatioMap = new HashMap<>();

        for (int stage = 1; stage <= N + 1; stage++) {
            reached += current[stage];
            failureRatioMap.put((double) reached / N, stage);
        }

        Set<Double> set = failureRatioMap.keySet();

        int[] answer = new int[N];


        set.forEach(failureRatioMap::get);


        return answer;
    }
}