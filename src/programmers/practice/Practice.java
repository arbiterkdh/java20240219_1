package programmers.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Practice {
    public static void main(String[] args) {
        String s = "123456";
        boolean a = s.length() == 4 || s.length() == 6 && s.matches("[0-9]+");
        System.out.println(a);

    }
}
