package baekjoon;

import java.util.Stack;

public class P25556_FourStack {
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 0; i < num; i++) {
//            sc.nextInt();
//        }

        P25556_FourStack fourStack = new P25556_FourStack();
        System.out.println(fourStack.clear("4 3 6 7 8 9 10 2 1 5"));;

    }

    public String clear(String str) {
        Stack<Character>[] stacks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack<>();
            stacks[i].push((char) 0);
        }

        char[] numbers = str.toCharArray();

        // 네개의 스택에 쌓을때부터 규칙이 있어야함
        for (int i = 0; i < 10; i++) {
            boolean checkFlag = false;
            for (int j = 0; j < 4; j++) {
                if (stacks[j].peek() < numbers[i]) {
                    stacks[j].push(numbers[i]);
                    checkFlag = true;
                    break; // 다 돌지 못하게 push 이후 종료
                }
            }

            if (!checkFlag) {
                return "NO";
            }
        }

        return "YES";
    }

}
