package programmers.basic.lv0;

import java.util.Arrays;

public class P_181861 {

    public int[] solution(int[] arr) {

        int[] answer = new int[Arrays.stream(arr).sum()];
        int count = 0;
        if (arr.length == 0) {
            return answer;
        } else {
            for (int num : arr) {
                for (int i = 0; i < num; i++) {
                    answer[count] = num;
                    count++;
                }
            }
        }
        return answer;
    }


}
