package programmers.basic.lv0;

public class P_181854 {

    public static void main(String[] args) {

        int[] arr = {49, 12, 100, 276, 33};

        for (int i : solution(arr, 27)) {
            System.out.println("i = " + i);
        }
    }

//        arr.length % 2 == 0 ? //짝수 : // 홀수
    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = i % 2 == 0 ? arr[i] + n : arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = i % 2 != 0 ? arr[i] + n : arr[i];
            }
        }
        return answer;
    }

}
