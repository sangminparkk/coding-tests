package programmers.practice;

import java.util.Arrays;
import java.util.Stack;

public class P_12906 {
    public static void main(String[] args) {

        P_12906 NotSameNumber = new P_12906();
//        Arrays.stream(NotSameNumber.solution(new int[]{4,4,4,3,3})).forEach(System.out::println);
        Arrays.stream(NotSameNumber.solution(new int[]{1, 1, 3, 3, 0, 1, 1})).forEach(System.out::println);
    }


    public Integer[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int i = numbers.length-1; i >= 0; i--) {
            if (numbers[i] != numbers[i + 1]) {
                stack.push(numbers[i]);
            } else {

            }
        }

        int idx = 0;
        Integer[] answer = new Integer[idx];

        while (!stack.isEmpty()) {
//            answer[idx++] = ;
        }

        return answer;
    }
}
