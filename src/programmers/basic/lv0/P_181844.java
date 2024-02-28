package programmers.basic.lv0;

public class P_181844 {
    public static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {}; // 항상 배열의 크기가 문제임. >> 동적배열이 이래서 필요한건가?

        // 탐색
        for (int i = 0; i < delete_list.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (delete_list[i] != arr[j]) {
//                    answer += arr[j]; // 배열의 크기가 정해지지 않았을때, 값 할당 불가
                }
            }

        }
        return answer;
    }
}
