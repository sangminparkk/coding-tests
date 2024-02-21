package programmers.basic.lv0;

public class P_181927_ref {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1]; // 동적배열
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];

        answer[answer.length-1] = (last > beforeLast) ? last - beforeLast : last * 2;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 5};

        for (int i : solution(arr)) {
            System.out.println(i);
        }

    }

}
