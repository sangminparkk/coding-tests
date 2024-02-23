package programmers.basic.lv0;

public class P_181874 {
    public static void main(String[] args) {
        String str = "abstract algebra"; // "AbstrAct AlgebrA"
        System.out.println(solution(str));
    }
    public static String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a') {
                answer += Character.toUpperCase(myString.charAt(i));
            } else {
                if (myString.charAt(i) != 'A' && Character.isUpperCase(myString.charAt(i))) {
                    answer += Character.toLowerCase(myString.charAt(i));
                } else {
                    answer += myString.charAt(i);
                }
            }
        }
        return answer;
    }

}
