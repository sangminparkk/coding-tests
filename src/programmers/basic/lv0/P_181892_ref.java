package programmers.basic.lv0;

import java.util.Arrays;

public class P_181892_ref {
    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}
