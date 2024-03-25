package programmers.problem06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {


    }
}


class Solution {
    public int solution(int[] ingredient) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i : ingredient) {
            num = (num + i) * 10;
        }
        sb.append(1);

        int answer = 0;
        return answer;
    }
}