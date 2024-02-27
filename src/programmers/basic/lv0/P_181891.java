package programmers.basic.lv0;

import java.util.Arrays;
import java.util.stream.Stream;

public class P_181891 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 6};
        for (int i : solution(arr, 1)) {
            System.out.println("i = " + i);
        }
    }

    public static Integer[] solution(int[] num_list, int n) {
        return Stream.concat(Arrays.stream(num_list)
                                .skip(n)
                                .boxed()
                        ,Arrays.stream(num_list)
                                .limit(n)
                                .boxed())
                .toArray(Integer[]::new);
    }
}
