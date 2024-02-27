package programmers.basic.lv0;

public class P_181873 {

    public static void main(String[] args) {

        String str = "programmers";
        String result = solution(str, "p");
        System.out.println("result = " + result);

    }


    public static String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.charAt(i) == alp.charAt(0) ? String.valueOf(my_string.charAt(i)).toUpperCase() : my_string.charAt(i) ;
        }
        return answer;
    }
}
