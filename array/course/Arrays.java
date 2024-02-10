package course;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);


         //input using for loops
         for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            
        }
        
        //print using for loops
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
            
        }
    }
}
