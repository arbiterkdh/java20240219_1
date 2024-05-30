package room501.debate.sort;

import java.util.Arrays;

public class BinaryInsertionSort {
    public static void main(String[] args) {
        //이진 삽입 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];

            int index = binarySearch(arr, key, 0, i);
            // binarySearch 메소드를 통해서
            // key 값이 삽입될 위치를 찾습니다.
            int j = i - 1;
            // 원래는 key 값과 비교를 하기 위한 j 값이었지만,
            // 여기서는 단순 시프트를 하기 위한 것입니다.
            while (j >= index) {
                arr[j + 1] = arr[j];
                j--;
                // index 위치엔 key 값이 들어갈 것이고,
                // 그 전까지의 값들을 반복해서 시프트 합니다.
            }
            arr[index] = key;
            // 이진 탐색을 통해 찾은 위치에 key 값이 들어가고,
            // 반복문을 통해 배열이 정렬됩니다.
        }
        System.out.println(Arrays.toString(arr));
    }

    static int binarySearch(int[] arr, int target, int low, int high) {
        // 원본 배열 arr, 타겟 넘버 target,
        // 정렬된 배열의 범위를 low 와 high 라는 인자로 받았습니다.
        while (low < high) {
            int middle = (low + high) / 2;
            // 좀 더 빠른 연산을 위해 / 2 부분을
            // 시프트 연산자를 써서 >>> 1 로 바꿔도 됩니다.
            // 또, 만약 정렬할 배열이 int 범위를 넘어가는 큰 배열이면
            // low + (high - low) / 2; 로 식을 바꿔야 합니다.
            if (arr[middle] > target) high = middle;
            else low = middle + 1;
            // 대소를 비교해서 high 와 low 범위를 좁혀줍니다.
        }

        return low;
        // 어차피 low 와 high 가 같아져야 반복문이 종료되기 때문에,
        // low 나 high 아무것이나 리턴돼도 상관없습니다.
    }
}
