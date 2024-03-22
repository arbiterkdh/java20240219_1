package ch17.sec14.problem07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(a -> a.getJob().equals("개발자"))
                .toList();

        developers
                .forEach(m -> System.out.println(m.getName()));
    }
}
