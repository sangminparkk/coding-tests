package programmers.basic.lv0;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class P_181879 {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        System.out.println(solution(arr));

    }


    public static int solution(int[] num_list) {
        int answer = 1;
        if (num_list.length <=  10) {
            for (int x : num_list) {
                answer *= x;
            }
        }
        return num_list.length >= 11 ? Arrays.stream(num_list).sum() : answer;
    }

}
