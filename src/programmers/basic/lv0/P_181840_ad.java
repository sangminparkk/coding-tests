package programmers.basic.lv0;

import java.util.Arrays;

public class P_181840_ad {
    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int x : num_list) {
            if (x == n) answer = 1;
        }
        return answer;
    }
}
