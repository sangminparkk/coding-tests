package programmers.basic.lv0;

public class P_181888 {
    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 1, 7, 6};
        for (int i : solution(arr, 2)) {
            System.out.println("i = " + i);
        }

    }
    public static int[] solution(int[] num_list, int n) {
        int count =  num_list.length % n == 0 ? num_list.length/n :  (num_list.length/n) + 1; // 이건 잘했음
        int[] answer = new int[count];
        int idx = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}
