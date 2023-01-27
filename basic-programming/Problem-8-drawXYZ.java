public class drawXYZ {
    private static void DrawXYZ(int n) {
        // Y adalah kelipatan Ganjil
        // Z adalah kelipatan genap
        // X Khusus urutan kelipatan 3
        //
        String hasil = "";
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (angka % 3 == 0) {
                    hasil += "X";
                } else if (angka % 2 != 0) {
                    hasil += "Y";
                } else {
                    hasil += "Z";
                }
                angka++;
            }
            hasil += "\n";
        }
        System.out.println(hasil);
    }

    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(9);
    }
}