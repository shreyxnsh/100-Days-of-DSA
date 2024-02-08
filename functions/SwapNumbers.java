package functions;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        swap(a, b);

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

     static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    
    }
}
