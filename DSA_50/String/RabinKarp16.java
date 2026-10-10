package DSA_50.String;

public class RabinKarp16 {

    public static void main(String[] args) {

        String text = "hello world";
        String pattern = "world";

        int index = text.indexOf(pattern);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }
}