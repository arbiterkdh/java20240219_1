package programmers.problem13;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] friends = {"a", "b", "c"};
        String[] gifts = {"a b", " b a", "a c", "c a", "b c", "b c"};
        for (String f : friends) {
            map.put(f, 0);
        }
        for (String gift : gifts) {
            String[] g = gift.split(" ");
            Integer give = map.get(g[0]) + 1;
            map.put(g[0], give);
            Integer take = map.get(g[0]) - 1;
            map.put(g[0], take);
        }
    }
}
