package ch13.lecture.p1generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class test2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
    }
}

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int cnt = 0;
        int repeat = 1;
        String dB = "";

        game:
        while (cnt < words.length) {

            for (int i = 1; i <= n; i++) {
                dB += words[cnt + i - 1] + " ";
                char end = words[cnt + i - 1].charAt(words[cnt + i - 1].length() - 1);
                char start = words[cnt + i].charAt(0);

                if (dB.contains(words[cnt + i]) || end != start) {
                    answer[0] = i + 1;
                    answer[1] = repeat;
                    break game;
                }

                if (cnt + i - 1 >= words.length) break;
            }

            cnt += n;
            repeat++;
        }

        return answer;
    }
}
