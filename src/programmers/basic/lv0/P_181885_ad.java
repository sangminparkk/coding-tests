package programmers.basic.lv0;

public class P_181885_ad {
    public static void main(String[] args) {

        String[] arr = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] bools = {true, false, true, false};

        for (String arg : solution(arr, bools)) {
            System.out.println("arg = " + arg);
        }
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        /**
         * 다른 사람풀이
         * 핵심
         * 1. String[]이 아닌 String으로 접근하여 해당 문제 해결
         */
        String answer = "";

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer += todo_list[i] + ","; // Need to be a string
            }
        }

        return answer.split(","); // split 본질 >> return String[]
    }
}
