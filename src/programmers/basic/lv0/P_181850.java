package programmers.basic.lv0;

public class P_181850 {
    public int solution(double flo) {
        int answer = 0;
        if (0 <= flo && flo <= 100) {
            answer = (int) Math.floor(flo);
        }
        return answer;
    }
}
