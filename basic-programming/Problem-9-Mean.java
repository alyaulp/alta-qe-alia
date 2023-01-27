public class Mean {
    private static float Mean(float[] numbers) {
        // m= jumlah data/banyak data
        float panjang = numbers.length;
        float jumlah = 0;

        for (int i = 0; i < panjang; i++) {
            jumlah = jumlah + numbers[i];
        }

        return jumlah / panjang;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));

    }
}