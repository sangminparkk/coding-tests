package programmers.basic.lv0;

public class P_181931 {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            answer += included[i] == true ? a + (i * d) : 0;
        }
        return answer;
    }
}
