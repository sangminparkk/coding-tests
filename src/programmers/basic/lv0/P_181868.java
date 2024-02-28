package programmers.basic.lv0;

public class P_181868 {

    public static void main(String[] args) {

        String str = "    programmers ";
        for (String s : solution(str)) {
            System.out.println("s = " + s);
        }
    }

    public static String[] solution(String my_string) {
        String[] split = my_string.split(" ");
        String str = "";
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                str += split[i] + ",";
            }
        }
        return str.split(",");
    }
}
