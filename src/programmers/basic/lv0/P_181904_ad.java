package programmers.basic.lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P_181904_ad {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
    }

    public static String solution(String my_string, int m, int c) {

        return IntStream.range(0, my_string.length())
                .filter(i -> i % m == c - 1)
                .mapToObj(i -> String.valueOf(my_string.charAt(i)))
                .collect(Collectors.joining());
    }
}
