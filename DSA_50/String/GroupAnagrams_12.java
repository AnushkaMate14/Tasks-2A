package DSA_50.String;
import java.util.*;

public class GroupAnagrams_12 {
    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}