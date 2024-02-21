package programmers.basic.lv0;

public class P_181872_ad {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
    }

    public static String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
