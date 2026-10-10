package DSA_50.SearchingSorting;
public class BookAllocation_43 {

    static boolean canAllocate(int[] books, int students, int maxPages) {

        int student = 1;
        int pages = 0;

        for (int book : books) {

            if (pages + book > maxPages) {

                student++;
                pages = book;

                if (student > students)
                    return false;

            } else {
                pages += book;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] books = {12, 34, 67, 90};
        int students = 2;

        int low = 0;
        int high = 0;

        for (int book : books) {
            high += book;
            low = Math.max(low, book);
        }

        int answer = high;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canAllocate(books, students, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }
}