package programmers.basic.lv0;

public class P_181863 {
    public static void main(String[] args) {

        String result = solution("programmersmmmm");
        System.out.println("result = " + result);

    }
    public static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
