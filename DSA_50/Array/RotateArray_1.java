package DSA_50.Array;
public class RotateArray_1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}