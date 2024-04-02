package room501.debate.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // 합병 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.

//        mergeSort(arr, 0, 9);


        System.out.println(Arrays.toString(arr));
    }
}
