package programmers.basic.lv0;

import java.util.Arrays;

public class P_181927 {
    public static int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOfRange(num_list, 0, num_list.length+1);
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];

        answer[answer.length-1] = (last > beforeLast) ? last - beforeLast : last * 2;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 5};

        for (int i : solution(arr)) {
            System.out.println(i);
        }

    }

}
