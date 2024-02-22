package programmers.basic.lv0;

import java.util.stream.IntStream;

public class P_181867 {

    public static int[] solution(String myString) {
        String[] splitArray = myString.split("x", myString.length());

        return IntStream.iterate(0, i -> i+1)
                .limit(splitArray.length) // max값이 없으면 무한 반복하게 됨 >> ArrayIndexOutOfBoundsException
                .map(i -> (splitArray[i].length() != 0) ? splitArray[i].length() : 0)
                .toArray();
    }

}

