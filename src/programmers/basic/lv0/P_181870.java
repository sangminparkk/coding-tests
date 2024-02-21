package programmers.basic.lv0;

import java.util.Arrays;

public class P_181870 {
    public static String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(str -> !str.contains("ad"))
                .toArray(String[]::new);
    }
}
