package room501.debate.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //삽입 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.
        int key; // 조건이 맞으면 삽입할 변수 생성
        // 변수명이 key 인 이유는,
        // 삽입정렬에서 key 값은 고정된 채로,
        // 자신보다 앞선 인덱스들과 차례대로 비교를 하기 때문입니다.
        for (int i = 1; i < arr.length; i++) {
            key = arr[i]; // 현재 인덱스의 값을 key 로 할당.
            int j = i - 1; // 맨 처음 비교를 시작할 key 값의 바로 앞 인덱스.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                // key 값의 바로 앞 인덱스부터 비교해서,
                // 비교를 통해 삽입될 위치를 찾아갑니다.
            }
            arr[j + 1] = key;
            // while 문이 종료되면 위치를 찾은 것이기 때문에,
            // 맞는 위치에 key 값을 삽입합니다.
        }
        System.out.println(Arrays.toString(arr));
    }
}