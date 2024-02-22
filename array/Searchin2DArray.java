public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {18, 14, 12, 21},
            {7, 15, 9, 10},
            {5, 6, 7, 8},
            {1, 2, 3, 4}
        };
        int target = 7;
        int[] res = search(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
