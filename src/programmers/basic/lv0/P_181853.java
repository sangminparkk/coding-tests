package programmers.basic.lv0;

import java.util.*;

public class P_181853 {
    public static void main(String[] args) {
        int[] arr = {12, 4, 15, 46, 38, 1, 14};

        int[] result = solution(arr);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 0, 5);
        return answer;
    }
}
