package programmers.basic.lv0;

public class P_181869 {

    public static void main(String[] args) {

        for (String s : solution("i love you")) {
            System.out.println(s);
        }

    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }

}
