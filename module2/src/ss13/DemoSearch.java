package ss13;

public class DemoSearch {

    public static void main(String[] args) {
        int[] array = {2, 7, 10, 18, 110, 230, 560};
        System.out.println(binarySearch(array, 20));
    }

    public static int linearSearch(int[] arr, int valueSearch) {
        // O(n)
        for (int i = 0; i < arr.length; i++) {

            // O(1)
            if (valueSearch == arr[i]) { // O(1)
                return i;  // O(1)
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int valueSearch) {

        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (last + first) / 2;
            if (arr[mid] == valueSearch) {
                return mid;
            } else if (arr[mid] < valueSearch) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
}
