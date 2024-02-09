package functions.assignment;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int n3 = sc.nextInt();


        System.out.println("The largest number is : " + largest(n1, n2, n3));
        System.out.println("The smallest number is : " + smallest(n1, n2, n3));
    }

    static int largest(int n1, int n2, int n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    static int smallest(int n1, int n2, int n3) {
        return Math.min(n1, Math.min(n2, n3));
    }

    
}
