public class BinarySearch {

    // comparing the iterations we get n/2^k = 1
    // n = 2^k
    // k = log2n
    // hence the time complexity of this program will be 0(log n)

    public static int binarySearch(int numbers[], int key){
        // the concept of binary search states that initialise the start and end variables of the array
        int start = 0;
        int end = numbers.length - 1;

        while(start <=end){
            int mid = (start+end)/2;

            //comparison
            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid] < key){ //right
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,10,8,12,14,16};
        int key = 10;

        System.out.println("Index for the key is : " + binarySearch(numbers, key));
    }}
