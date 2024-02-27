package programmers.basic.lv0;

public class P_181842 {

    public static void main(String[] args) {

        System.out.println(solution("abc","aabcc"));
    }

    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }


}
