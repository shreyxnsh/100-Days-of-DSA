import java.util.*;

public class LargestinArray {

    // time complexity of this program is O(n)
    // function to find the largest element in the array
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        // loop runs from 0 to n 
        for(int i= 0; i<numbers.length; i++){
            // this statement checks if any number is greater than largest
            // feed that value to largest
            if(largest < numbers[i]){
                largest = numbers[i];
            } 
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,5,8,24,9,10,15}; 

        System.out.println("The largest value in the given array is : " +getLargest(numbers));
    }
}
