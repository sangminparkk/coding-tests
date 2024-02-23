package programmers.basic.lv0;

public class P_181925 {
    public static String solution(int[] numLog) {
        String answer = "";
        for (int i = 0; i < numLog.length-1; i++) {
            switch (numLog[i+1] - numLog[i]) {
                case 1 :
                    answer = answer.concat("w");
                    continue;
                case -1:
                    answer = answer.concat("s");
                    continue;
                case 10:
                    answer = answer.concat("d");
                    continue;
                case -10:
                    answer = answer.concat("a");
                    continue;
            }
        }
        return answer;
    }

}
