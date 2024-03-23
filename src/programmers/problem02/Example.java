package programmers.problem02;

public class Example {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            String prev = " ";
            while (!babbling[i].isEmpty()) {
                int idx = 0;

                if (babbling[i].startsWith("aya") && !babbling[i].startsWith(prev)) {
                    idx = babbling[i].indexOf("aya");
                    babbling[i] = babbling[i].substring(idx + 3);
                    prev = "aya";
                }
                if (babbling[i].startsWith("ye") && !babbling[i].startsWith(prev)) {
                    idx = babbling[i].indexOf("ye");
                    babbling[i] = babbling[i].substring(idx + 2);
                    prev = "ye";
                }
                if (babbling[i].startsWith("woo") && !babbling[i].startsWith(prev)) {
                    idx = babbling[i].indexOf("woo");
                    babbling[i] = babbling[i].substring(idx + 3);
                    prev = "woo";
                }
                if (babbling[i].startsWith("ma") && !babbling[i].startsWith(prev)) {
                    idx = babbling[i].indexOf("ma");
                    babbling[i] = babbling[i].substring(idx + 2);
                    prev = "ma";
                }
                if (idx == 0) break;
            }

            if (babbling[i].isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}