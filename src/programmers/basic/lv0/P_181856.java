package programmers.basic.lv0;

import java.util.Arrays;

public class P_181856 {

    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            if (Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()) {
                return 0;
            } else if (Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return arr1.length > arr2.length ? 1 : -1;
        }
    }

}
