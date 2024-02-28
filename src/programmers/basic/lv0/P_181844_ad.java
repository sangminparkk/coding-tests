package programmers.basic.lv0;

import java.util.Arrays;
import java.util.HashSet;

public class P_181844_ad {
    public static int[] solution(int[] arr, int[] delete_list) {
        // 동적 배열 > HashSet
        HashSet<Integer> delete = new HashSet<>();

        for (int i : delete_list) {
            delete.add(i);
        }

        return Arrays.stream(arr)
                .filter(i -> !delete.contains(i)) // contains를 사용하기 위해 Set을 사용한 케이스.
                .toArray();
    }
}
