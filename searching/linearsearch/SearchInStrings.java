public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Harry";
        char target = 'r';
        System.out.println(searchString(name, target));
    }


    static int searchString(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
