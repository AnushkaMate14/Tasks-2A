package DSA_50.String;

import java.util.*;

public class MinimumWindow18 {
    public static void main(String[] args) {

        String str = "ADOBECODEBANC";
        String target = "ABC";

        int[] freq = new int[128];

        for (char ch : target.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int count = target.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < str.length(); right++) {

            if (freq[str.charAt(right)] > 0) {
                count--;
            }

            freq[str.charAt(right)]--;

            while (count == 0) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                freq[str.charAt(left)]++;

                if (freq[str.charAt(left)] > 0) {
                    count++;
                }

                left++;
            }
        }

        System.out.println(
            str.substring(start, start + minLength)
        );
    }
}
