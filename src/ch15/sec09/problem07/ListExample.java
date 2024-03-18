package ch15.sec09.problem07;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

        Solution solution = new Solution();
        System.out.println(solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }


}

class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int stone : stones) {
            list.add(stone);
        }
        while (list.size() > 1) {
            int max = 0;
            int maxIdx = 0;
            int subMax = 0;
            int subMaxIdx = 0;

            for (int i = 0; i < list.size(); i++) {
                if (Math.max(list.get(i), max) != max) {
                    subMax = max;
                    subMaxIdx = maxIdx;
                    max = list.get(i);
                    maxIdx = i;
                }
            }
            if (max > subMax) list.add(max - subMax);

            if (maxIdx > subMaxIdx) {
                list.remove(maxIdx);
                list.remove(subMaxIdx);
            } else {
                list.remove(subMaxIdx);
                list.remove(maxIdx);
            }
        }
        return list.size() == 0 ? 0 : list.get(0);

    }
}
