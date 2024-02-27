package programmers.basic.lv0;

public class P_181854_ref {

    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        for (int i : solution(arr, 27)) {
            System.out.println("i = " + i);
        }
    }

    public static int[] solution(int[] arr, int n) {
        for (int idx = arr.length % 2 == 0 ? 1 : 0; idx < arr.length; idx += 2) {
            arr[idx] += n;
        }
        return arr;
    }

}
