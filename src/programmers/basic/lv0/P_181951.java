package programmers.basic.lv0;

import java.util.Scanner;

public class P_181951 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 5\n
        int b = sc.nextInt(); // 5\n

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close(); // 필요한 이유
        /**
         * 리소스를 제대로 닫지 않으면
         * 1. 데이터 손실이나 의도하지 않은 손상이 일어나 버그가 발생될 가능성이 높음
         * 2. 리소스 닫는 처리 안할시 메모리 사용량 증가(JVM에서 종료 안해줌) + 성능저하
         */
    }


}
