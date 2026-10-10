package DSA_50.RecursionBacktracking;
public class AllSubsets_38 {

    static void printSubsets(int[] arr, int index, String result) {

        if (index == arr.length) {
            System.out.println(result);
            return;
        }

        printSubsets(arr, index + 1, result);

        printSubsets(
            arr,
            index + 1,
            result + arr[index] + " "
        );
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        printSubsets(arr, 0, "");
    }
}