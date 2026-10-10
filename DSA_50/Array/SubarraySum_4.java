package DSA_50.Array;

public class SubarraySum_4 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int sum = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            while (sum > target && start <= i) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println(
                    "Subarray found from index " +
                    start + " to " + i
                );
                break;
            }
        }
    }
}