package programmers.basic.lv0;

public class P_181920_ad {
    public static int[] solution(int start_num, int end_num) {
        int[] numbers = new int[end_num - start_num + 1];

        int base_num = 0; // 추가
        for (int i = start_num; i <= end_num; i++) { // To be clear
            numbers[base_num] = i;
            base_num++; // 추가
        }
        return numbers;
    }
}
