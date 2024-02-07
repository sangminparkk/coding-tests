package programmers.basic.lv0;

public class P_181937 {
    public static int solution(int num, int n) {
        int answer = (num % n == 0) ? 1 : 0; // 클린코드 측면 > 삼항 연산자
        return answer;
    }
}
