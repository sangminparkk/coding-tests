package programmers.basic.lv0;

import java.util.Arrays;

public class P_181882_ad {
    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(x -> (x >= 50 && x % 2 == 0) ? x / 2 : (x < 50 && x % 2 != 0) ? x * 2 : x).toArray();
    }
}
