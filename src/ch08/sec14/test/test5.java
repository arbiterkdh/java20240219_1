package ch08.sec14.test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] delete_list = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int e : arr) {
            list.add(e);
        }
        for (int e : delete_list) {
            list.remove((Integer) e);
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
