package programmers.basic.lv0;

public class P_181935 {
    public static int solution(int n) {
        int sum = 0;

        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                sum = i % 2 == 1 ? sum += i : sum;
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                sum = i % 2 == 0 ? sum += i * i : sum;
            }
        }
        return sum;
    }

}
