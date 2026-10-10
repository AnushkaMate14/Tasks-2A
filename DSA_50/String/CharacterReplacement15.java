package DSA_50.String;

public class CharacterReplacement15 {
    public static void main(String[] args) {

        String str = "AABABBA";
        int k = 1;

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < str.length(); right++) {

            int index = str.charAt(right) - 'A';
            freq[index]++;

            maxFreq = Math.max(maxFreq, freq[index]);

            while ((right - left + 1) - maxFreq > k) {

                freq[str.charAt(left) - 'A']--;
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        System.out.println(answer);
    }
}
