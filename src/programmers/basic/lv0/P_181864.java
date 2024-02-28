package programmers.basic.lv0;

public class P_181864 {
    public static int solution(String myString, String pat) {
        StringBuilder modified = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                modified.append((char) 66);
            } else {
                modified.append((char) 65);
            }
        }
        return modified.toString().contains(pat) ? 1 : 0;
    }
}
