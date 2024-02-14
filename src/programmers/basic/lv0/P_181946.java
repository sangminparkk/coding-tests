package programmers.basic.lv0;

import java.util.Scanner;

public class P_181946 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] strings = text.split(" ");

        System.out.println(strings[0] + strings[1]);

    }
}
