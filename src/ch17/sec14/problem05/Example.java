package ch17.sec14.problem05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expression",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
