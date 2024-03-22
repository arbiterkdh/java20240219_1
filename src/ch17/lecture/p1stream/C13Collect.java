package ch17.lecture.p1stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C13Collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring", "html", "react");

        List<Integer> result1 = new ArrayList<>();

        for (String s : list) {
            result1.add(s.length());
        }

        System.out.println(result1); // [4, 3, 6, 4, 5]

        List<Integer> result2 = list.stream()
                .collect(() -> new ArrayList<>(),
                        (c, e) -> c.add(e.length()),
                        (a, b) -> a.addAll(b));

        List<Integer> result3 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("result3 = " + result3);
    }
}
