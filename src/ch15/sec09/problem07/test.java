package ch15.sec09.problem07;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>() {
        });
        answer.get(0).add(1);
    }
}
