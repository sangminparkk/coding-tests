package programmers.basic.lv0;

public class P_181886_ref {
    public static String[] solution(String[] names) {
        String[] answer = new String[(names.length-1)/5+1]; // 클린
        int idx = 0;
        for (int i = 0; i < names.length; i += 5) { // 조건부 선언시 i++ > i +=5 활용
            answer[idx++] = names[i];
        }
        return answer;
    }
}

