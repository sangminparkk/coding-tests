package programmers.basic.lv0;

import java.util.Arrays;

public class P_181852 {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .sorted()
                .skip(5)
                .toArray();
    }
}
