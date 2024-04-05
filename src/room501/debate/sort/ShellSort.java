package room501.debate.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        // 셸 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.
        int swap; // 조건에 맞으면 swap 하기 위한 변수 생성
        // 셸정렬은 gap 을 이용해서 배열을 부분정렬하고,
        // 매 반복마다 gap 을 반씩 줄여나가는 게 정석이나,
        // 여러 자료에서 말하길, gap 의 간격을 gap / 3 + 1 로
        // 하는 것이 더 효율적이라고 합니다.
        for (int gap = arr.length / 3 + 1; gap > 0; gap /= 3 + 1) {
            // 매 반복시의 갭 간격 설정
            for (int i = 0; i < arr.length - gap; i++) {
                // 각 반복에서 필요한 만큼만 순환하게끔 범위 설정
                for (int j = i + gap; j < arr.length; j += gap) {
                    // 분리된 각 배열을 오름차순 정렬
                    if (arr[i] > arr[j]) {
                        // 조건에 맞으면 swap
                        swap = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swap;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
