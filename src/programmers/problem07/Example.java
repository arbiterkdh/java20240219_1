package programmers.problem07;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        double[][] failureRatio = new double[N + 1][2];

        int[] current = new int[N + 2];
        for (int player : stages) {
            current[player]++;
        }

        int reached = 0;
        int isZero = 0;
        for (int i = N; i > 0; i--) {
            reached += current[i];
            if (current[i] == 0) {
                isZero++;
                continue;
            }
            failureRatio[i][1] = (double) current[i] / reached;
            failureRatio[i][0] = i;
        }

        double temp0;
        double temp1;
        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j < N + 1; j++) {
                if (failureRatio[i][1] < failureRatio[j][1]) {
                    temp0 = failureRatio[i][0];
                    temp1 = failureRatio[i][1];

                    failureRatio[i][0] = failureRatio[j][0];
                    failureRatio[i][1] = failureRatio[j][1];

                    failureRatio[j][0] = temp0;
                    failureRatio[j][1] = temp1;
                }
            }
        }

        int[] answer = new int[N - isZero];
        int idx = 1;
        for (int i = 0; i < answer.length; i++) {
            if (failureRatio[idx][0] != 0.0) {
                answer[i] = (int) failureRatio[idx][0];
            }
            idx++;
        }

        return answer;
    }
}
