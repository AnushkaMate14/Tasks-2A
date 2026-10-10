package DSA_50.RecursionBacktracking;
public class SubsetSum_37 {

    static boolean find(int[] arr, int index, int target) {

        if (target == 0)
            return true;

        if (index == arr.length)
            return false;

        return find(arr, index + 1, target - arr[index]) ||
               find(arr, index + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 8, 10};
        int target = 11;

        System.out.println(find(arr, 0, target));
    }
}
