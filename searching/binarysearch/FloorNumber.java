package searching.binarysearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18, 19};
        int target = 15;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){
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
        return end;
        
    }
}
