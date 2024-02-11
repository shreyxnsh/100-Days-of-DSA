package course;

public class SwapArray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        swap(arr, 1, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
