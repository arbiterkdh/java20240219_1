package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.ArrayList;

public class C07Sample {
    public static void main(String[] args) {
        //TODO : null 대신 익명클래스 객체 코드 작성.

        Game rpsGame = new Game() {
            @Override
            public void play() {
                int i = (int) (3 * Math.random() + 1);
                System.out.println(i == 1 ? "가위" : i == 2 ? "바위" : "보");
            }
        };
        rpsGame.play(); // 가위 ,바위, 보 중 하나 출력

        Game lottoGame = new Game() {
            @Override
            public void play() {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < 6; i++) {
                    int x = (int) (45 * Math.random() + 1);
                    if (!list.contains(x)) {
                        list.add(x);
                    } else {
                        i -= 1;
                    }
                }
                System.out.println(list.toString());
            }
        };
        //초보자: 1~45 값 중 한개 출력
        //중급자: 1~45 값 중 6개 중복없이 출력
        lottoGame.play();
    }
}

interface Game {
    void play();
}
