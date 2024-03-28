package programmers.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_12906_ref {
    public static void main(String[] args) {

        P_12906_ref NotSameNumber = new P_12906_ref();
//        Arrays.stream(NotSameNumber.solution(new int[]{4,4,4,3,3})).forEach(System.out::println);
        Arrays.stream(NotSameNumber.solution(new int[]{1, 1, 3, 3, 0, 1, 1})).forEach(System.out::println);
    }


    public Integer[] solution(int[] numbers) {
        //stack X >> list

        List<Integer> list = new ArrayList<>();
        list.add(numbers[0]); // 2. 그러기 위해선 첫번째 값은 base로 잡아줘야함

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) { //1. 요 로직
                list.add(numbers[i]);
            }
        }

        Integer[] answer = new Integer[list.size()];

        for (int i = 0; i < list.size(); i++) {
             answer[i] = list.get(i);
        }

        return answer;
    }
}
