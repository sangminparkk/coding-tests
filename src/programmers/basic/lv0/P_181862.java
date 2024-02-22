package programmers.basic.lv0;

import java.util.Arrays;

public class P_181862 {
    public static void main(String[] args) {

        String str = "cabab";

        for (String s : solution(str)) {
            System.out.println("s = " + s);
        }

    }

    public static String[] solution(String myStr) {
        return myStr.split("[abc]").length == 0 ? new String[]{"EMPTY"} : Arrays.stream(myStr.split("[abc]"))
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);
    }

}
