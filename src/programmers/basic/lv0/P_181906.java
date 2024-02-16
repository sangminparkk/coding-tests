package programmers.basic.lv0;

public class P_181906 {
    public static int solution(String my_string, String is_prefix) {
        if (my_string.length() < is_prefix.length()) {
            return 0;
        } else {
            return (my_string.substring(0, is_prefix.length()).equals(is_prefix)) ? 1 : 0;
        }
    }

}
