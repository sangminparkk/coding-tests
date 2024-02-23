package programmers.basic.lv0;

import java.util.stream.Collectors;

public class P_181874_ref {
    public static void main(String[] args) {
        String str = "abstract algebra"; // "AbstrAct AlgebrA"
        System.out.println(solution(str));
    }
    public static String solution(String myString) {
        return myString.chars()
                .mapToObj(c -> String.valueOf( (char) (c == 97 || c == 65 ? Character.toUpperCase(c) : Character.toLowerCase(c))))
                .collect(Collectors.joining());
    }

}
