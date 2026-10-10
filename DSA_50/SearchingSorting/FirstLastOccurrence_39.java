package DSA_50.SearchingSorting;

public class FirstLastOccurrence_39 {

    static int first(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                answer = mid;
                high = mid - 1;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return answer;
    }

    static int last(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                answer = mid;
                low = mid + 1;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        System.out.println(first(arr, target));
        System.out.println(last(arr, target));
    }
}