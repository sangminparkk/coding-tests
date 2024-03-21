package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P10818_FindMinMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 배열 특성을 잘 이해하고 있는가? 정렬하면 맨앞, 맨뒤
        Arrays.sort(numbers);
        System.out.printf("%d %d", numbers[0], numbers[numbers.length-1]);
    }
}
