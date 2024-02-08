import java.util.Scanner;

public class ReverseArray {

    // motive is to lower the time and space complexities
    // if we create another array with reversed values then TC || SC = O(n)
    // but if we swap elements TC = O(n) and SC = O(1)

    public static void reverseArray(int numbers[]){
        // comparing first and last elements and swapping them
        int first = 0;
        int last = numbers.length-1;

        Scanner sc = new Scanner(System.in);
        while (first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        reverseArray(numbers);
        for(int i =0; i <numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
