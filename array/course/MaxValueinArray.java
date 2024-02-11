package course;

public class MaxValueinArray {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxValue(arr));
    }

     static int maxValue(int[] arr) {
        // assume max value 
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // find max value in range
    static int maxValueInRange(int[] arr, int start, int end) {
        // assume max value 
        int max = arr[start];
        
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
