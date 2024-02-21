package programmers.basic.lv0;

public class P_181927_ref {
    public static int[] solution(int[] num_list) {
        // 동적 배열
        int[] answer = new int[num_list.length+1];

        // 배열 복사 > 값 할당
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        // 마지막 원소 할당
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];
        answer[num_list.length] = (last > beforeLast) ? last - beforeLast : last * 2;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 5};

        for (int i : solution(arr)) {
            System.out.println(i);
        }

    }

}
