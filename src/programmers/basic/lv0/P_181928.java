package programmers.basic.lv0;

import java.util.Arrays;

public class P_181928 {

    public static void main(String[] args) {
        int[] arr = {5,7,8,3};
        int result = solution(arr);
        System.out.println(result);
    }


    public static int solution(int[] num_list) {
        int answer = 0;
        String evenString = "";
        String oddString = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenString += Integer.toString(num_list[i]);
            } else {
                oddString += Integer.toString(num_list[i]);
            }
        }

        int evenNumber = Integer.parseInt(evenString);
        int oddNumber = Integer.parseInt(oddString);

        answer = evenNumber + oddNumber;
        return answer;
    }
}

