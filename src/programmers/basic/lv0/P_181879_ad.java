package programmers.basic.lv0;

import java.util.Arrays;

public class P_181879_ad {
    public static int solution(int[] num_list) {
        return num_list.length >= 11 ? Arrays.stream(num_list).reduce(0, Integer::sum) : Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
    }
}
