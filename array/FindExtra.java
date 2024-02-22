public class FindExtra {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 9, 10, 12};
        int[] arr2 = {2, 4, 6, 8, 10, 12};
        System.out.println(findExtra(arr1, arr2));
    }

    static int findExtra (int arr1[], int arr2[]) {
        // what if i sum all the elements of both the arrays and then subtract the sum of the smaller array from the sum of the larger array
        // the difference will be the extra element
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        return sum1 - sum2;
        
    }
}
