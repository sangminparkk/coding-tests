package programmers.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P_120813 {
    public static void main(String[] args) {
        P_120813 oddNumber = new P_120813();
        Arrays.stream(oddNumber.solution(10)).forEach(System.out::print);
    }

    public int[] solution(int n) {
        return IntStream.range(1, n + 1).filter(k -> k % 2 != 0).sorted().toArray();
    }
}
