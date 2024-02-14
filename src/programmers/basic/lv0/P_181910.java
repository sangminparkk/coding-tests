package programmers.basic.lv0;

public class P_181910 {

    public static void main(String[] args) {
        String my_string = "He110W0r1d";
        int end_point = 5;
        String result = solution(my_string, end_point);
        System.out.println(result);
    }

    public static String solution(String my_string, int n) {
//        return my_string.substring(my_string.length()-n, my_string.length()); // 어차피 끝단까지라서 생략 가능
        return my_string.substring(my_string.length()-n);
    }
}
