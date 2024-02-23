package programmers.basic.lv0;

public class P_181904_ref {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
//        System.out.println("ihrhbakrfpndopljhygc".length());
    }

    public static String solution(String my_string, int m, int c) {
        String answer = "";

        // 굳이 만들 필요가 없다면?
        // idx 조건부 활용이 약함.. > i++ > i += m
        for (int i = c-1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
