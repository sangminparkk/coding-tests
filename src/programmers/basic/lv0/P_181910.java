package programmers.basic.lv0;

public class P_181910 {
    public static String solution(String my_string, int n) {
//        return my_string.substring(my_string.length()-n, my_string.length()); // 어차피 끝단까지라서 생략 가능
        return my_string.substring(my_string.length()-n);
    }
}
