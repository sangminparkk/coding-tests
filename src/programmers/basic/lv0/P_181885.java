package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181885 {
    public static void main(String[] args) {

        String[] arr = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] bools = {true, false, true, false};

        for (String arg : solution(arr, bools)) {
            System.out.println("arg = " + arg);
        }
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, todo_list.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }
}
