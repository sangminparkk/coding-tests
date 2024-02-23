package programmers.basic.lv0;

public class P_181904 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
//        System.out.println("ihrhbakrfpndopljhygc".length());
    }

    public static String solution(String my_string, int m, int c) {
        String answer = "";
        int stringIdx = 0;
        String[][] arr = new String[my_string.length()/m][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(my_string.charAt(stringIdx++));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i][c-1];
        }

        return answer;
    }
}
