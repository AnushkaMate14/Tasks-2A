package DSA_50.String;

public class CountAndSay_14 {

    public static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        String previous = countAndSay(n - 1);
        String result = "";

        int count = 1;

        for (int i = 1; i <= previous.length(); i++) {

            if (i < previous.length() &&
                previous.charAt(i) == previous.charAt(i - 1)) {

                count++;

            } else {

                result += count;
                result += previous.charAt(i - 1);
                count = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(countAndSay(n));
    }
}