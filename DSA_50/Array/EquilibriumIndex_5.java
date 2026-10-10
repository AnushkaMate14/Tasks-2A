package DSA_50.Array;

public class EquilibriumIndex_5 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};

        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            totalSum -= arr[i];

            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index: " + i);
                break;
            }

            leftSum += arr[i];
        }
    }
}