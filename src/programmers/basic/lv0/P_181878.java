package programmers.basic.lv0;

public class P_181878 {
    public static void main(String[] args) {

        int result = solution("AbCdEfG", "aBc");
        System.out.println("result = " + result);
    }

    public static int solution(String myString, String pat) {
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}
