package course;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        // 2 Pointer approach to reverse an array
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
