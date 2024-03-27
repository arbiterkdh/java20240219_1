package programmers.problem12;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));
    }
}

class Solution {
    public String[] solution(String[] players, String[] callings) {
        List<String> list = new LinkedList<>(List.of(players));
        for (int i = 0; i < callings.length; i++) {

        }
        return new String[]{};
    }
}
