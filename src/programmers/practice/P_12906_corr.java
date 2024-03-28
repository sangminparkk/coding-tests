package programmers.practice;

import java.util.Arrays;
import java.util.Stack;

public class P_12906_corr {
    public static void main(String[] args) {

        P_12906_corr NotSameNumber = new P_12906_corr();
        Arrays.stream(NotSameNumber.solution(new int[]{4,4,4,3,3})).forEach(System.out::println);
//        Arrays.stream(NotSameNumber.solution(new int[]{1, 1, 3, 3, 0, 1, 1})).forEach(System.out::println);
    }


    public Integer[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int num : numbers) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        Integer[] answer = new Integer[stack.size()];
        int idx = stack.size()-1;
        while (!stack.isEmpty()) {
            answer[idx--] = stack.pop();
        }

        return answer;
    }
}
