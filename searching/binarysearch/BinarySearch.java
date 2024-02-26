package searching.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            // find the middle element
            int mid = start + (end - start) / 2;
            // if middle element is the target
            if(arr[mid] == target){
                return mid;
            }
            // if target is greater than the middle element
            else if(arr[mid] < target){
                start = mid + 1;
            }
            // if target is less than the middle element
            else{
                end = mid - 1;
            }
        }
        return -1;
        
    }
}
