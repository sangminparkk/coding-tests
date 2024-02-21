package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181875_ad {

    public static String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] str = {"aBc", "AbC"};
        for (String s : solution(str)) {
            System.out.println(s);
        }
    }

}
