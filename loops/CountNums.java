package loops;
import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        
        // number of digits in a number

        // tip : n%10 will give the last digit of the number
        // n = n/10 will remove the last digit from the number
        // repeat the above two steps until the number becomes 0
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = sc.nextInt();
        int count = 0;

        while(n > 0){
            
            int rem = n%10;
            if (rem == number) {
                count++;
            }
            n = n/10;
            
        }
        System.out.println(count);
    }
}
