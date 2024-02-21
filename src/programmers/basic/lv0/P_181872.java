package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181872 {
    public static void main(String[] args) {
        System.out.println(solution("AAAAaaaa", "a"));
    }

    public static String solution(String myString, String pat) {
        String answer = "";
        int n = myString.lastIndexOf(pat);
        answer = myString.substring(0, n) + pat;
        return answer;
    }

}
