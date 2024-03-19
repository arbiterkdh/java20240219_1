package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C03NestedList {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        List<List<Integer>> list;
        list = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {

            list.add(new ArrayList<>(arr[i].length));
            for (int j = 0; j < arr[i].length; j++) {
                list.get(i).add(arr[i][j]);
            }
        }

        System.out.println(list.get(1).get(1));
        System.out.println(list.get(2).get(2));
        System.out.println(list.get(1).get(0));
    }
}
