package programmers.problem01;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(30, new int[]{1, 4, 5, 7, 8, 11, 15, 19, 22, 23, 24, 25, 30}, new int[]{2, 3, 4, 6, 7}));

        int[] numbers = new int[]{0, 0, 0, 0, 0};
        int idx = 0;
        for (int n : numbers) {
            numbers[idx] = n + 10;
            idx++;
        }
        System.out.println(Arrays.toString(numbers));

    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] stolen = new boolean[n + 1];
        int ableStudents = n;

        for (int clothes : lost) {
            stolen[clothes] = true;
            ableStudents--;
        }

        for (int spare = 1; spare < reserve.length; spare++) {
            if (stolen[reserve[spare - 1]]) {
                ableStudents++;
                stolen[reserve[spare - 1]] = false;
                reserve[spare] = 0;

            } else if (spare < reserve.length - 1 && stolen[reserve[spare + 1]]) {
                ableStudents++;
                stolen[reserve[spare + 1]] = false;
                reserve[spare] = 0;

            } else if (stolen[reserve[spare]]) {
                ableStudents++;
                stolen[reserve[spare]] = false;
                reserve[spare] = 0;
            }
        }

        // for (int i = 1; i < n+1; i++) {
        //     for (int j = 0; j < reserve.length; j++) {
        //         if (stolen[i] && (reserve[j] == i + 1 || reserve[j] == i - 1)) {
        //             stolen[i] = false;
        //             reserve[j] = 0;
        //             ableStudents++;
        //         }
        //     }
        // }

        return ableStudents;
    }
}
