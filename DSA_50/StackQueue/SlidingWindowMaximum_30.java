package DSA_50.StackQueue;

import java.util.*;

public class SlidingWindowMaximum_30 {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            while (!deque.isEmpty() &&
                   deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            while (!deque.isEmpty() &&
                   arr[deque.peekLast()] <= arr[i]) {

                deque.pollLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }
}
