package programmers.basic.lv0;

public class P_181920 {
    public static int[] solution(int start_num, int end_num) {
        int[] numbers = new int[end_num - start_num + 1];

        for (int i = 0; i <= end_num-start_num; i++) {
            numbers[i] = i + start_num ;
        }
        return numbers;
    }
}
