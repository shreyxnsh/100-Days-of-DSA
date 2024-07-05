package recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5,8,9, 10, 40 };
        int n = arr.length;
        int key = 10;
        int low = 0;
        int high = n - 1;
        int result = binarySearch(arr, low, high, key);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
        
    }

    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, low, mid - 1, key);
        } else {
            return binarySearch(arr, mid + 1, high, key);
        }
    }
}
