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
        // 힙 정렬은 이진트리를 구현해서 정렬하는 방식으로,
        // 부모 root 와 자식과의 비교를 통해서 정렬하고,
        // 자식 노드가 다시 부모가 돼서 비교하는 형태로
        // 최대힙 또는 최소힙을 만든 뒤,
        // 최상위 인덱스와 최하위 인덱스를 맞바꾸고,
        // 최하위 인덱스를 제외하고 위 과정을 반복해서
        // 오름차순 혹은 내림차순 정렬을 완성합니다.
        System.out.println(Arrays.toString(arr));
    }

    static void heapSort(int[] arr, int size) {
        // 원본 배열을 직접 참조해서 최대힙을 만들고 정렬하기 때문에
        // arr 을 인자로 받고,
        // 마지막 부모 노드의 위치를 구하고,
        // 최대힙 완성 이후에 반복 작업을 수행하기 위해
        // arr 의 length 를 인자로 받고,
        // 가독성을 위해 size 라고 표현합니다.
        for (int i = size / 2 - 1; i >= 0; i--) {
            // 자식노드 위치의 배열크기를 2로 나눈 후 1을 빼면
            // 부모 인덱스의 값이 나오는데,
            // 이것을 이용하면 현재 i 가 root 노드가 되고,
            // 이것을 이용해 heapify(= 이진트리를 힙구조로 재배열) 를
            // root 를 감소시키며 수행함으로써
            // 최대힙 또는 최소힙을 만드는 반복문 입니다.
            heapify(arr, size, i);
        }
        for (int i = size - 1; i > 0; i--) {
            // 최초 힙 재배열이 끝난 이후,
            // 최상위와 최하위 인덱스를 교환하고,
            // 최하위 인덱스는 제외한 heapify 를
            // 반복해서 수행함으로써 원하는 정렬을 완성합니다.
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int size, int root) {
        // 원본 배열인 arr 과
        // heapify 를 수행할 범위를 지정할 size 를 인자로 받고,
        // 비교 및 재배열을 위해 root 를 인자로 지정합니다.
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

