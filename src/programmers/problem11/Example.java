package programmers.problem11;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"},
                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
    }
}

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        int[] AtoZ = new int[26];

        for (String t : terms) {
            AtoZ[t.charAt(0) - 'A'] = Integer.parseInt(t.substring(2));
        }

        int[][] privacyArr = new int[privacies.length][3];
        int pIdx = 0;
        int sum;

        for (String p : privacies) {
            sum = AtoZ[p.charAt(11) - 'A'];

            privacyArr[pIdx][0] = Integer.parseInt(p.substring(0, 4));       // year
            privacyArr[pIdx][1] = Integer.parseInt(p.substring(5, 7)) + sum; // month
            privacyArr[pIdx][2] = Integer.parseInt(p.substring(8, 10));       // day

            if (privacyArr[pIdx][1] > 12) {
                privacyArr[pIdx][0] += privacyArr[pIdx][1] / 12;
                privacyArr[pIdx][1] %= 12;
            }
            pIdx++;
        }

        String[] todayArr = today.split("\\.");
        int temp = 0;
        int aIdx = 1;
        for (int[] a : privacyArr) {
            if (a[0] < Integer.parseInt(todayArr[0])) {
                temp = (temp + aIdx) * 10;

            } else if (a[0] == Integer.parseInt(todayArr[0])
                    && a[1] < Integer.parseInt(todayArr[1])) {
                temp = (temp + aIdx) * 10;

            } else if (a[0] == Integer.parseInt(todayArr[0])
                    && a[1] == Integer.parseInt(todayArr[1])
                    && a[2] < Integer.parseInt(todayArr[2])) {
                temp = (temp + aIdx) * 10;
            }
            aIdx++;
        }

        temp /= 10;
        int[] answer = new int[(temp + "").length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp % 10;
            temp /= 10;
        }

        return answer;
    }
}