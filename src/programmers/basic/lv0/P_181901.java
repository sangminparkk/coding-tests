package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181901 {
    public static int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % k == 0)
                .toArray();
    }
}
