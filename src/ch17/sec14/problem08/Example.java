package ch17.sec14.problem08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));

        System.out.println("[개발자]");
        List<Member> list1 = list.stream().filter(e -> e.getJob().equals("개발자")).toList();
        list1.forEach(member -> System.out.printf("{name:%s, job:%s} \n", member.getName(), member.getJob()));

        System.out.println();

        System.out.println("[디자이너]");
        List<Member> list2 = list.stream().filter(e -> e.getJob().equals("디자이너")).toList();
        list2.forEach(member -> System.out.printf("{name:%s, job:%s} \n", member.getName(), member.getJob()));


    }
}
