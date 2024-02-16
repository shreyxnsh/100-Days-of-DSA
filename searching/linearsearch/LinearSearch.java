public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 25;

        int ans = search(arr, target);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + ans);
        }
        
    }

    // function to return the index of the target element
    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // check if the current element is equal to the target

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
