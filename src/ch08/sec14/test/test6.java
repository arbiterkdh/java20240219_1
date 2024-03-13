package ch08.sec14.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] query = {4, 1, 2};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                list = list.subList(0, query[i]);
            } else {
                list = list.subList(query[i], list.size());
            }
        }
        System.out.println(list.toString());
    }
}
