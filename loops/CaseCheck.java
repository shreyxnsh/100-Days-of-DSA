package loops;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().trim().charAt(0);

        System.out.println(ch >= 'a' && ch <= 'z' ? "Lowercase" : "Uppercase");
        // trim removes the empty spaces from the input
    }
}
