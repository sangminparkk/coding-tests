package programmers.practice;

public class P_81301_corr {
    public static void main(String[] args) {

        P_81301_corr wordToNum = new P_81301_corr();
        System.out.println(wordToNum.solution("23four5six7"));
    }

    public int solution(String s) {

        String[] strArr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strArr.length; i++) {
            s = s.replace(strArr[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
