package programmers.basic.lv0;

public class P_181939_ref {
    public static void main(String[] args) {
        System.out.println(solution(89,8));
    }

    public static int solution(int a, int b) {
        int num1 = Integer.parseInt("" + a + b);
        int num2 = Integer.parseInt("" + b + a);

        return num1 > num2 ? num1 : num2;
    }
}



