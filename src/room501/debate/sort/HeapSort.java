package room501.debate.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        // 힙 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.
        heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void heapSort(int[] arr, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
        for (int i = size - 1; i > 0; i--) {
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int size, int root) {
        int largest = root;
        int l = root * 2 + 1;
        int r = root * 2 + 2;

        if (l < size && arr[l] > arr[largest]) largest = l;
        if (r < size && arr[r] > arr[largest]) largest = r;

        if (largest != root) {
            int swap = arr[root];
            arr[root] = arr[largest];
            arr[largest] = swap;

            heapify(arr, size, largest);
        }
    }
}

