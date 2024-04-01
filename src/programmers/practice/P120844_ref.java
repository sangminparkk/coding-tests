package programmers.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120844_ref {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> result = new ArrayList<>();
        // 동적 배열 > O(1)으로 인덱스를 수정/추가/삭제 가능 ★★★
        for (int num : numbers) {
            result.add(num);
        }

        if (direction.equals("right")) {
            result.add(0, result.get(result.size() - 1));
            result.remove(result.size() - 1);
        } else {
            result.add(result.size(), result.get(0));
            result.remove(0);
        }

        System.out.println(result);
        return null;
    }

    public static void main(String[] args) {
        P120844_ref p = new P120844_ref();
        System.out.println(Arrays.toString(p.solution(new int[]{1,2,3}, "right")));
        System.out.println(Arrays.toString(p.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }
}
