package programmers.basic.lv0;

import java.util.Arrays;
import java.util.List;

public class P_181840 {
    public static int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(x -> x == n) ? 1 : 0;
    }
}
