package programmers.basic.lv0;

import java.util.Arrays;

public class P_181875 {

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] str = {"aBc", "AbC"};
        for (String s : solution(str)) {
            System.out.println(s);
        }
    }

}
