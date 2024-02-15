package programmers.basic.lv0;

import java.util.Arrays;

public class P_181882 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        for (int i : solution(arr)) {
            System.out.println("i = " + i);
        }

    }

    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(x -> {
                    if (x >= 50 && x % 2 == 0) return x / 2;
                    else if (x < 50 && x % 2 != 0) return x * 2;
                    else return x;
                }).toArray();
    }
}
