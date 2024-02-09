package programmers.basic.lv0;

public class P_181936 {

    public static void main(String[] args) {

        int result = solution(55, 10, 5);
        System.out.println("result = " + result);
    }

    public static int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }

}
