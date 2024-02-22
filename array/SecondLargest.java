public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {64,62,64,64,64};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
            // but if all the elements of the array are same so in that case we should show output as -1
            else {
                secondLargest = -1;

            }
        }
        return secondLargest;
    }
}
