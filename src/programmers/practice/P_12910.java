package programmers.practice;

import java.util.Arrays;

public class P_12910 {
    public static void main(String[] args) {
        P_12910 returnDivisor = new P_12910();
        System.out.println(Arrays.toString(returnDivisor.solution(new int[]{5, 9, 7, 10}, 5)));
//        System.out.println(Arrays.toString(returnDivisor.solution(new int[]{3,2,6}, 10)));
    }

    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[count];

        int idx = 0;
        for (int num : arr) {
            if (num % divisor ==0) {
                answer[idx++] = num;
            }
        }
        Arrays.sort(arr); // sort팅은 최대한 숫자를 적게 만든다음 적용하는게 좋다.
        return answer;
    }
}