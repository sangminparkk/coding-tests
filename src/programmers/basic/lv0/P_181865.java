package programmers.basic.lv0;

public class P_181865 {
    public static int solution(String binomial) {

        String[] split = binomial.split(" ");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[2]);

        String condition = split[1];
        int answer = condition == "*" ? 1 : 0;
        switch (split[1]) {
            case "+" :
               answer = num1 + num2;
               break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
        }

        return answer;
    }
}
