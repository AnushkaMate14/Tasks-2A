package DSA_50.SearchingSorting;

import java.util.*;

public class AggressiveCows_42 {

    static boolean canPlace(int[] stalls, int cows, int distance) {

        int count = 1;
        int last = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - last >= distance) {

                count++;
                last = stalls[i];

                if (count == cows)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int answer = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canPlace(stalls, cows, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }
}