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
        // 병합 정렬은 재귀형을 띄기 때문에,
        // 분할된 배열의 크기가 1이면 더 이상 나눌 수 없으니 종료 구문을 넣습니다.

        int middle = size / 2;
        int[] l = new int[middle];
        int[] r = new int[size - middle];
        // 절반으로 나눈 뒤, 분할된 배열을 생성합니다.

        for (int i = 0; i < middle; i++) {
            l[i] = arr[i];
        }
        for (int i = middle; i < size; i++) {
            r[i - middle] = arr[i];
        }
        // 각 분할 배열에 원래 배열의 값을 담습니다.

        mergeSort(l, middle);
        mergeSort(r, size - middle);
        merge(arr, l, r, middle, size - middle);
        // 재귀형으로 호출하여 분할하고,
        // 합치는 메소드를 사용하여 정렬합니다.
    }

    static void merge(int[] arr, int[] l, int[] r, int left, int right) {
        // 원본배열 arr, 비교하며 조건에 맞는 순서대로 들어갈 배열 l 과 r,
        // 각 배열의 크기를 나타내는 left 와 right 를 인자로 받습니다.

        int arrIdx = 0, lIdx = 0, rIdx = 0;
        // l, r 의 원소들 중 조건에 맞는 것이 먼저 들어가고,
        // 그 다음 비교를 하기 위해 lIdx, rIdx 를 따로 변수로 지정합니다.
        // arrIdx 는 비교될 때마다 값이 증가하며,
        // 원본 배열에 순차적으로 담기기 위한 변수입니다.

        while (lIdx < left && rIdx < right) {
            // l 과 r 이 서로 비교하며 조건에 맞는 값이 먼저 들어가는데,
            // 둘 중 하나라도 더이상 비교할 값이 없으면 반복문이 종료됩니다.
            if (l[lIdx] > r[rIdx]) arr[arrIdx++] = r[rIdx++];
            else arr[arrIdx++] = l[lIdx++];
        }
        while (lIdx < left) arr[arrIdx++] = l[lIdx++];
        while (rIdx < right) arr[arrIdx++] = r[rIdx++];
        // 처음 while 문에서 비교되지 못하고 남은 원소가
        // l 의 것인지 r 의 것인지 모르기 때문에,
        // 두개의 while 을 넣어줘서 둘 다 확인합니다.
    }
}











