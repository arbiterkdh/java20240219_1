package ch11.lecture.p1exception;

import java.util.List;

public class C07Finally {
    public static void main(String[] args) {
        // finally
        // exception 발생 여부와 관계 없이, return 을 해도
        //  할상 실행되는 블럭
        try {
            List.of("a", "b").get(2);
            List.of("a", "b").get(1);

            return;

        } finally {
            System.out.println("무조건 실행");

        }

    }
}
