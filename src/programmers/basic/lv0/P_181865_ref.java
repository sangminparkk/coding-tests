package programmers.basic.lv0;

public class P_181865_ref {
    public int solution(String binomial) {
        String[] split = binomial.split(" ");

        switch (split[1]) {
            case "+" :
               return Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
            case "-":
                return Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
            case "*":
                return Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
        }
        return 0;
    }
}
