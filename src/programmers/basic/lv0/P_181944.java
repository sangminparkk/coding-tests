package programmers.basic.lv0;

import java.util.Scanner;

public class P_181944 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String answer = (n % 2 == 0) ? " is even" : " is odd";
        System.out.println(n + answer);
    }
}
