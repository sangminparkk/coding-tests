package programmers.practice;

public class P_81301 {
    public static void main(String[] args) {

        P_81301 wordToNum = new P_81301();
        System.out.println(wordToNum.solution("23four5six7"));
    }

    public int solution(String s) {
        StringBuilder targetToChanged = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            } else if (Character.isAlphabetic(c)) {
                targetToChanged.append(c);
                switch (targetToChanged.toString()) {
                    case "zero" :
                        result.append("0");
                    case "one" :
                        result.append("1");
                    case "two" :
                        result.append("2");
                    case "three" :
                        result.append("3");
                    case "four" :
                        result.append("4");
                    case "five" :
                        result.append("5");
                    case "six" :
                        result.append("6");
                    case "seven" :
                        result.append("7");
                    case "eight" :
                        result.append("8");
                    case "nine" :
                        result.append("9");
                }
            }
        }

        return Integer.parseInt(result.toString());
    }
}
