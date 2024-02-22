public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {18,14,12,7,15};
        System.out.println(smallest(arr));
    }

    static int smallest(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < res) {
                res = arr[i];
            }
        }
        return res;
    }
}
