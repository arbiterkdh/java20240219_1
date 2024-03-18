package ch15.sec09.problem07;

import java.util.*;

public class test {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));

    }
}


class Solution {
    public int solution(int k, int[] tangerine) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(tangerine);

        for (int i = 0; i < tangerine.length - 1; i++) {
            if (tangerine[i] == 0) continue;

            int cnt = 1;

            for (int j = i + 1; j < tangerine.length; j++) {
                if (tangerine[i] == tangerine[j]) {
                    cnt++;
                    tangerine[j] = 0;
                } else {
                    break;
                }
            }
            list.add(cnt);
        }
        Collections.sort(list);

        int answer = 0;
        while (k > 0) {
            k -= list.getLast();
            list.removeLast();
            answer++;
        }

        return answer;
    }
}

