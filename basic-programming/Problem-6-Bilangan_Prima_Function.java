public class Main {
    private static boolean primeNumber(int number) {
        int tampungan = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                tampungan++;
            }
        }

        if (tampungan == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11)); // true
//        System.out.println(primeNumber(13));
//        System.out.println(primeNumber(17));
//        System.out.println(primeNumber(20));
//        System.out.println(primeNumber(35));

    }
}