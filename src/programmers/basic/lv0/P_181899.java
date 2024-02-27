package programmers.basic.lv0;

public class P_181899 {

    public static void main(String[] args) {
        for (int i : solution(10, 3)) {
            System.out.println("i = " + i);
        }
    }

    public static int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start;
            start--;
        }

        return answer;
    }

}
