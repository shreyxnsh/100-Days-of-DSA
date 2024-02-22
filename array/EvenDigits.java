public class EvenDigits {
    public static void main(String[] args) {
        
        int[] arr = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int res = 0;

        // number of even elements in the array
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 == 0 ){
        //         res++;
        //     }
        // }

        // number of even digits in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while (arr[i] > 0) {
                arr[i] = arr[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
