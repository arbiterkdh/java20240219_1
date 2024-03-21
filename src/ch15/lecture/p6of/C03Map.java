package ch15.lecture.p6of;

import java.util.Map;

public class C03Map {
    public static void main(String[] args) {
        Map<String, String> map1 = Map.of("css", "style sheets",
                "spring", "framework",
                "java", "language",
                "react", "library");
//        기존 맵의 특징처럼 두개씩 짝을 짓기 때문에, 홀수 개 할당 불가.
        System.out.println(map1);

    }
}
