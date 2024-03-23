package programmers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example02 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        solution2.solution("dfjardstddetckdaccccdegk", 4);
        
    }

}

class Solution2 {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }
}