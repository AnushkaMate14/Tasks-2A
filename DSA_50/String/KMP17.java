package DSA_50.String;

public class KMP17 {

    public static void main(String[] args) {

        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        int[] lps = new int[pattern.length()];

        int len = 0;
        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            else {

                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        i = 0;
        int j = 0;

        while (i < text.length()) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                System.out.println("Pattern found at index: " + (i - j));
                j = lps[j - 1];
            } 
            else if (i < text.length() &&
                     text.charAt(i) != pattern.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }
}
