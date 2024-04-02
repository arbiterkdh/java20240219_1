package room501.debate.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // 퀵 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.

        quickSort(arr, 0, 9);
        // 퀵 정렬은 low 와 high 를 기준으로
        // 서로 교차하는 방향으로 탐색하면서 분할 정렬합니다.

        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = low + (high - low) / 2;
        int pValue = arr[pivot];
        int left = low;
        int right = high;

        while (left <= right) {
            while (arr[left] < pValue) {
                left++;
            }
            while (arr[right] > pValue) {
                right--;
            }
            if (left <= right) {
                int swap = arr[left];
                arr[left] = arr[right];
                arr[right] = swap;
                left++;
                right--;
            }
        }

        quickSort(arr, low, right);
        quickSort(arr, left, high);
    }
}
