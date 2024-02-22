package programmers.basic.lv0;

import java.util.Arrays;

public class P_181867_ref {

    public static int[] solution(String myString) {

        /**Overview
         * 왜 Arrays.stream이 아닌 Intstream으로 접근하였는가?
         *
         * Problem
         * : Arrays.stream을 사용했을때, int[] 배열로 만들 수가 없었다.
         * > Arrays.stream().map().toArray() >> 객체로만 받을 수 있는줄..
         *
         * Solution
         * > Arrays.stream().*mapToInt()*.toArray()
         */
        return Arrays.stream(myString.split("x", myString.length()))
                .mapToInt(x -> x.length())
                .toArray();
    }

}

