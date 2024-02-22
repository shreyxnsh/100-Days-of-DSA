import java.util.ArrayList;

public class DuplicateinArray {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 1, 2,  4,  };

        System.out.println(duplicate(arr));
    }

    static ArrayList<Integer> duplicate(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] < 0) {
                res.add(index);
            } else {

            }
            arr[index] = -arr[index];
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
}
