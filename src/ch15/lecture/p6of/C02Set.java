package ch15.lecture.p6of;

import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("spring", "java", "css", "react");
        System.out.println(set1);

//        set1.add("vue");
//        Set<String> set2 = Set.of("vue", "spring", "vue");
//        중복된 값을 넣는것 불가(Set의 특징), 한번 할당한 후에는 변경 불가(of의 특징).
    }
}
