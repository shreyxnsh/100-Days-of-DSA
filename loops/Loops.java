package loops;

import java.util.Scanner;

public class Loops {
    /**
     * @param args
     */
    public static void main(String[] args) {
        


        // print numbers from 1 to 5 
        // for(int i = 1; i<=5; i++){
        //     System.out.println(i);
        // }

        // print numbers 1 to n 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        for(int i = 1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}
