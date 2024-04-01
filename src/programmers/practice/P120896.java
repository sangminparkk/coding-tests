package programmers.practice;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * 1. 한번만
 * 2. 사전순
 */
public class P120896 {
    public String solution(String s) {
        s = s.trim();
        char[] arr = s.toCharArray();

        Hashtable<Character, Integer> ht = new Hashtable<>();
        StringBuilder result = new StringBuilder();

        for (char c : arr) {
            ht.put(c, ht.getOrDefault(c, 0) + 1); // main logic
        }

        for (char c : arr) {
            if (ht.get(c) == 1) {
                result.append(c);
            }
        }

        Arrays.sort(result.chars().toArray()); // 여기서 처리해야 연산량이 줄어든다
        return result.toString();
    }

    public static void main(String[] args) {
        P120896 p = new P120896();
        System.out.println(p.solution("hello")); // eho
        System.out.println(p.solution("abcabcadc")); // eho
        System.out.println(p.solution("abdc")); // eho
    }
}
