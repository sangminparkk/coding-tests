package programmers.basic.lv0;

import java.util.Arrays;

public class P_181835_ad {
    public static int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(x -> (k % 2 == 0) ? x + k : x * k).toArray();
    }
}
