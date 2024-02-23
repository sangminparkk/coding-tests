package programmers.basic.lv0;

public class P_181886 {
    public static String[] solution(String[] names) {
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1]; // 나머지
        int idx = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) answer[idx++] = names[i];
        }
        return answer;
    }
}
