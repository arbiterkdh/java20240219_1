package ch15.lecture.p5map;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class C01Map {
    public static void main(String[] args) {
        // map : entry (key, value) 를 저장
        // 같은 key 를 가진 두 개의 entry 를 저장할 수 없음.

        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("java", "programming language");
        map.put("css", "style sheet");
        map.put("html", "hypertext markup language");
        map.put("spring", "java framework");
        map.put("react", "frontend library");
        map.put("css", "style sheet");

        Map<Double, Integer> map1 = new HashMap<>();
        map1.put(1.0, 1);
        map1.put(5.0, 5);
        map1.put(6.0, 6);
        map1.put(2.0, 2);
        map1.put(4.0, 4);


        Set<Integer> keySet = new HashSet<>(map1.values());
        System.out.println(keySet);

        System.out.println(keySet);
        System.out.println("asdasdasdasdasdasdasdasdasdasdasdads");

        System.out.println(map.size());

        // entry 검색
        boolean b1 = map.containsKey("java");
        boolean b2 = map.containsKey("css");
        boolean b3 = map.containsKey("jsp");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // entry 의 value 얻기
        String value1 = map.get("java");
        String value2 = map.get("react");
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        String value3 = map.get("jsp:");
        System.out.println("value3 = " + value3);

        // entry 수정
        map.put("java", "프로그래밍 언어");
        String value4 = map.get("java");
        System.out.println("value4 = " + value4);

        if (map.containsKey("css")) {
            map.put("css", "스타일 시트");
        }
        if (map.containsKey("jsp")) {
            map.put("jsp", "java server page");
        }

        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println("map.get(\"jsp\") = " + map.get("jsp"));

        // entry 지우기
        System.out.println("map.size() = " + map.size());
        String value6 = map.remove("css");
        System.out.println("map.size() = " + map.size());
        String value7 = map.remove("jsp");
        System.out.println("map.size() = " + map.size());
        System.out.println("value6 = " + value6);
        System.out.println("value7 = " + value7);
        // map 크기

        // 전체탐색
        // 1. ketSet
        System.out.println("####keySet && 향상된 for 활용");
        Set<String> keys = map.keySet();
        // forEach
        keys.forEach((s) -> System.out.println(s + ":" + map.get(s)));
        // iterator
        Iterator<String> iterator1 = keys.iterator();
        Iterator<String> iterator2 = keys.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + ":" + map.get(iterator2.next()));
        }
        // enhanced for
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        // 2. entrySet
        System.out.println("### entrySet && 향상된 for 활용");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // forEach
        entries.forEach((x) -> System.out.println(x.getKey() + ":" + x.getValue()));
        // iterator
        Iterator<Map.Entry<String, String>> iterator3 = entries.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        // enhanced for
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // 3. forEach
        System.out.println("### forEach 메소드 활용");
        map.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
