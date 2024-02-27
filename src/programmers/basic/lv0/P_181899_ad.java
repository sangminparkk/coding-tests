package programmers.basic.lv0;

import java.util.Comparator;
import java.util.stream.IntStream;

public class P_181899_ad {

    public static void main(String[] args) {
        for (int i : solution(10, 3)) {
            System.out.println("i = " + i);
        }
    }

    public static Integer[] solution(int start, int end_num) {
        return IntStream.rangeClosed(end_num, start)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
    }

}
