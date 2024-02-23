package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181931_ad {
    public static int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx] ? a + (idx * d) : 0).sum();
    }
}
