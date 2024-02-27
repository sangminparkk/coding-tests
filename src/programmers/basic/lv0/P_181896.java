package programmers.basic.lv0;

public class P_181896 {

    public static void main(String[] args) {
        int[] arr = {12, 4, 15, 46, 38, 15};

        System.out.println("solution(arr); = " + solution(arr));
    }

    public static int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {

            if (num_list[i] < 0) {
                answer = i;
                break;
            }


        }
        return answer;
    }

}
