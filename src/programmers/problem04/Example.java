package programmers.problem04;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matched = 0;
        int zeroCnt = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    matched++;
                    break;
                }
            }
        }

        answer[0] = (matched + zeroCnt <= 1) ? 6 : (7 - matched + zeroCnt);
        answer[1] = (matched <= 1) ? 6 : (7 - matched);
        return answer;
    }
}
