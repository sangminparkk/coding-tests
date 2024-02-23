package programmers.basic.lv0;

import java.util.Arrays;

public class P_181858 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 1, 1};

        int[] result = solution(arr, 4);

        for (int i : result) {
            System.out.println("i = " + i);
        }

    }

    public static int[] solution(int[] arr, int k) {
        int count = (int) Arrays.stream(arr).distinct().count();
        int[] answer = new int[count >= k ? k : count + (k-count)];

        if (count >= k) {
            answer = Arrays.stream(arr).distinct().limit(k).toArray();
        } else {
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = i < count ? arr[i] : -1;
                }
        }
        return answer;
    }
}
