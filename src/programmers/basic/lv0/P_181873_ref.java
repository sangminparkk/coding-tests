package programmers.basic.lv0;

public class P_181873_ref {

    public static void main(String[] args) {
        String str = "programmers";
        String result = solution(str, "p");
        System.out.println("result = " + result);
    }


    public static String solution(String my_string, String alp) {
        String changed = alp.toUpperCase();
        return my_string.replaceAll(alp, changed);
    }
}
