package ch15.sec09.problem09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("red", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> set = map.keySet();
        for (String key : set) {
            if (maxScore < map.get(key)) {
                maxScore = map.get(key);
                name = key;
            }
            totalScore += map.get(key);
        }


        System.out.println("평균 점수: " + totalScore / map.size());
        System.out.println("최고 점수: " + maxScore);
        System.out.println(name);
    }
}
