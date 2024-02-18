package programmers.basic.lv0;

public class P_181926_ref {
    public static int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w' :
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        return n;
    }
}