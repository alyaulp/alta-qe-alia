public class Main {

    private static boolean palindrome(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == value.charAt(value.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
//        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("LION"));
    }
}