package DSA_50.StackQueue;
import java.util.*;

public class LargestRectangle_29 {

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int current = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() &&
                   current < heights[stack.peek()]) {

                int height = heights[stack.pop()];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        System.out.println(maxArea);
    }
}