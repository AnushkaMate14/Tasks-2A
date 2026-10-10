package DSA_50.SearchingSorting;

public class PeakElement_41 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Peak index: " + low);
        System.out.println("Peak value: " + arr[low]);
    }
}
