package programmers.basic.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P_181927_ad {
    public static int[] solution(int[] num_list) {
        int[] result = IntStream.iterate(0, i -> i + 1) // i++
                .limit(num_list.length + 1) // 동적 배열 크기 > Arrays size
                .map(i -> i == num_list.length ?  (num_list[i-1] > num_list[i-2] ? (num_list[i-1] - num_list[i-2]) : 2 * num_list[i-1]) : num_list[i]) // 상세 구현 >> debug 돌려보면 바로 알게 됨
                .toArray(); // 최종 array

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 5};

        for (int i : solution(arr)) {
            System.out.println(i);
        }

    }

}
