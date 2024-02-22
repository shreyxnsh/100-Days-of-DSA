public class PalindromeString {
    public static void main(String[] args) {
        String str = "epajfxzfnvte";
        System.out.println(isPalindromeString(str));
    }

    static int isPalindromeString(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
}
