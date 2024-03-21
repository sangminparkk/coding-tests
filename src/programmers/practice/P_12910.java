package programmers.practice;

import java.util.Arrays;

public class P_12910 {
    public static void main(String[] args) {
        P_12910 returnDivisor = new P_12910();
//        System.out.println(Arrays.toString(returnDivisor.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(returnDivisor.solution(new int[]{3,2,6}, 10)));
    }

    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);// 처음부터 sort

        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        // 이렇게 코드로 쉽게 처리할 수 있었네. >> 현재 나한테 부족한점은
        if (count == 0) {
            return new int[]{-1};
        }

        //아니면 정상출력
        int[] answer = new int[count];

        int idx = 0;
        for (int num : arr) {
            if (num % divisor ==0) {
                answer[idx++] = num;
            }
        }
        return answer;
    }
}