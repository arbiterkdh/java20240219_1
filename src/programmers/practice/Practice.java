package programmers.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Practice {
    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        Long l = 123L;
        String s = "4312";
        long i = Long.reverse(l);
        long[] answer = LongStream.range(x, x * n + 1).filter(o -> o % x == 0).toArray();
        System.out.println(Arrays.toString(answer));
        System.out.println(i);
    }
}
