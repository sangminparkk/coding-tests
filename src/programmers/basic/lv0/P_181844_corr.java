package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181844_corr {
    public static int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr)
                .filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i))
                .toArray();
    }
}
