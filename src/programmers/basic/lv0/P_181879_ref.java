package programmers.basic.lv0;

import java.util.Arrays;

public class P_181879_ref {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(solution(arr));
    }

    public static int solution(int[] num_list) {
        int answer =  num_list.length >= 11 ? 0 : 1; // 변수에도 삼항연산자

        if (num_list.length >= 11) {
            for (int x : num_list) answer += x;
        } else {
            for (int x : num_list) answer *= x;
        }
        return answer;
    }

}
