package DSA_50.Graphs;

import java.util.*;

public class WordLadder_50 {

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = Arrays.asList(
            "hot", "dot", "dog", "lot", "log", "cog"
        );

        Set<String> set = new HashSet<>(wordList);

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String word = queue.poll();

                if (word.equals(endWord)) {
                    System.out.println("Length: " + level);
                    return;
                }

                char[] chars = word.toCharArray();

                for (int j = 0; j < chars.length; j++) {

                    char original = chars[j];

                    for (char ch = 'a'; ch <= 'z'; ch++) {

                        chars[j] = ch;

                        String newWord = new String(chars);

                        if (set.contains(newWord)) {

                            queue.add(newWord);
                            set.remove(newWord);
                        }
                    }

                    chars[j] = original;
                }
            }

            level++;
        }

        System.out.println("No transformation possible");
    }
}
