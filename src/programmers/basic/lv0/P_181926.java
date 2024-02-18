package programmers.basic.lv0;

public class P_181926 {
    public static int solution(int n, String control) {
        char[] arr = control.toCharArray();

        for (char c : arr) {
            if (c == 'w') {
                n += 1;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }
        return n;
    }
}