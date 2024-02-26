package programmers.basic.lv0;

public class P_181838 {
    public static int solution(int[] date1, int[] date2) {
        //[2021, 12, 28]	[2021, 12, 29]	1
        // 검증 : date1, date2만 비교하는 프로그램이라는 가정하 >> 실패
        return date1[date1.length - 1] < date2[date2.length - 1] ? 1 : 0;
    }
}
