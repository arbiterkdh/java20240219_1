package room501.debate.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // 합병 정렬을 구현한 코드입니다.
        int[] arr = new int[11];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.

        mergeSort(arr, arr.length);
        // 병합 정렬은 더이상 나눌 수 없을 때까지
        // 분할한 뒤, 합치면서 정렬하는 방식입니다.

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int size) {
        if (size < 2) return;

        int middle = size / 2;
        int[] l = new int[middle];
        int[] r = new int[size - middle];

        for (int i = 0; i < middle; i++) {
            l[i] = arr[i];
        }
        for (int i = middle; i < size; i++) {
            r[i - middle] = arr[i];
        }

        mergeSort(l, middle);
        mergeSort(r, size - middle);

        merge(arr, l, r, middle, size - middle);
    }

    static void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int arrIdx = 0, lIdx = 0, rIdx = 0;

        while (lIdx < left && rIdx < right) {
            if (l[lIdx] > r[rIdx]) {
                arr[arrIdx++] = r[rIdx++];
            } else {
                arr[arrIdx++] = l[lIdx++];
            }
        }
        while (lIdx < left) {
            arr[arrIdx++] = l[lIdx++];
        }
        while (rIdx < right) {
            arr[arrIdx++] = r[rIdx++];
        }
    }
}











