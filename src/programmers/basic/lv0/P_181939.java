package programmers.basic.lv0;

public class P_181939 {
    public static void main(String[] args) {
        System.out.println(solution(89,8));
    }

    public static int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);

        int num1 = Integer.parseInt(str1 + str2);
        int num2 = Integer.parseInt(str2 + str1);

        return num1 > num2 ? num1 : num2;
    }
}


