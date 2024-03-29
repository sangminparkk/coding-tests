package programmers.basic.lv0;

public class P_181930_ad {

    public static int solution(int a, int b, int c) {
        double answer = 1;
        int caseNum = a == b && b == c ? 3 : a == b || b == c || a == c ? 2 : 1;
        for (int i = 1; i <= caseNum; i++) {
            answer *=  Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
        }
        return (int) answer;
    }
}
