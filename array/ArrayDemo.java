public class ArrayDemo{

    // passing array as arguement
    public static void update(int numbers[]){
        // for loop to increase the value of each index by 1
        for(int i=0; i <numbers.length; i++){
            numbers[i] = numbers[i] +1;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {97,98,99};
        update(numbers);

        // for loop to print the entire array
        for(int i =0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
     }
}