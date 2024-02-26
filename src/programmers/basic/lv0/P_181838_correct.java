package programmers.basic.lv0;

public class P_181838_correct {
    public static int solution(int[] date1, int[] date2) {
        // 다른사람 풀이 : 본질에 접근 (숫자화하여 비교)
        return date1[0] * 10000 + date1[1] * 100 + date1[2] < date2[0] * 10000 + date2[1] * 100 + date2[2]  ? 1 : 0;
    }
}
