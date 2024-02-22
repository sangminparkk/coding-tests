package programmers.basic.lv0;

import java.util.Arrays;

public class P_181867_ad {
    public static Integer[] solution(String myString) {
        return Arrays.stream(myString.split("x", -1))
                .map(String::length)
                .toArray(Integer[]::new);
    }
}

