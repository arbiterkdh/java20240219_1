package room501.debate.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        // 기수 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.
        radixSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void countSort(int[] arr, int size, int scope) {
        int[] sorted = new int[size];
        int[] bucket = new int[10];
        int i;

        for (i = 0; i < size; i++)
            bucket[(arr[i] / scope) % 10]++;

        for (i = 1; i < 10; i++)
            bucket[i] += bucket[i - 1];

        for (i = size - 1; i >= 0; i--) {
            sorted[bucket[(arr[i] / scope) % 10] - 1] = arr[i];
            bucket[(arr[i] / scope) % 10]--;
        }

        for (i = 0; i < size; i++) arr[i] = sorted[i];
    }

    static void radixSort(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++)
            if (arr[i] > max)
                max = arr[i];
        for (int scope = 1; max - scope >= 0; scope *= 10)
            countSort(arr, size, scope);
    }
}

