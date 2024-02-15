package programmers.basic.lv0;

public class P_181884 {
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            if (answer <= n) answer += number;
        }
        return answer;
    }
}