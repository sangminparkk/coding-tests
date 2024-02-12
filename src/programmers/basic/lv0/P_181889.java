package programmers.basic.lv0;

public class P_181889 {

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n]; // 배열 선언 : 크기
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i]; // 대입
        }
        return answer;
    }
}
