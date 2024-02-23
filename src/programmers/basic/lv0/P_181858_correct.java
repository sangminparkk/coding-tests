package programmers.basic.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P_181858_correct {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 1, 1};

        int[] result = solution(arr, 4);
        for (int i : result) {
            System.out.println("i = " + i);
        }


    }

        // 힌트 : Intstream.concat > 두개 배열 합치기
    public static int[] solution(int[] arr, int k) {
        return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)).limit(k).toArray();
    }
}
