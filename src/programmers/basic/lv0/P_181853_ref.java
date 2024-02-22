package programmers.basic.lv0;

import java.util.Arrays;

public class P_181853_ref {

    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .sorted()
                .limit(5)
                .toArray();
    }

}
