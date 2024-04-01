package programmers.practice;

import java.util.Arrays;

public class P120844 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
        } else {
            // 이건 너무 노가다임.. 답이 아닐 확률이 매우 높다
            answer[numbers.length - 1] = numbers[0];
            for (int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1]; // 1, 2 -> 0, 1
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P120844 p = new P120844();
        System.out.println(Arrays.toString(p.solution(new int[]{1,2,3}, "right")));
        System.out.println(Arrays.toString(p.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }
}
