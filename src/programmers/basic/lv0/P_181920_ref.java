package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181920_ref {
    /**
     * range : endExclusive
     * rangeClosed : endInclusive
     *
     * >> map 처리는 불요함. range 메서드 자체가 순차처리하여 return해줌
     */
    public static int[] solution(int start_num, int end_num) {

//        return IntStream.range(start_num, end_num+1).toArray();
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
