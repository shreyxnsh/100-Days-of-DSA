package course;
import java.util.Scanner;
import java.util.Arrays;

public class MultiDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2D Arrays are matrix arrays

        // this is a 3*3 matrix array
        int[][] arr = new int[3][2];

        // here 3 is the number of rows and 2 is the number of columns

        //taking input in 2D array
        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            // print like a matrix
            System.out.println();
        }

        // better way of printing 
        for (int row = 0; row < arr.length; row++) {
            
            // print like a matrix
            System.out.println(Arrays.toString(arr[row]));
        }

        // more enhanced loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
