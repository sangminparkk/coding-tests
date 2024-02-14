package programmers.basic.lv0;

import java.util.Arrays;

public class P_181892 {
    public static void main(String[] args) {

        int[] lists = {5,2,1,7,5};
        int[] results = solution(lists, 2);

        for (int result : results) {
            System.out.println("result = " + result);
        }

    }
    public static int[] solution(int[] num_list, int n) {
         return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}
