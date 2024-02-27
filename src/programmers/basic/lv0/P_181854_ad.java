package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181854_ad {

    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        for (int i : solution(arr, 27)) {
            System.out.println("i = " + i);
        }
    }

    public static int[] solution(int[] arr, int n) {

        return IntStream.range(0, arr.length)
                .map(i -> arr[i] + ((i % 2 == (arr.length % 2 == 0 ? 1 : 0)) ? n : 0)).toArray();
    }

}
