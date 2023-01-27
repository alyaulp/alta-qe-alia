public class Pengurangan extends penjumlajan {
    int angka3;
    int angka4;

    public int caramenmengurangkan() {
        int hasil = angka1 - 2;
        return hasil;
    }

    public void setAngka3(int angka3) {
        this.angka3 = angka3;
    }

    public void setAngka4(int angka4) {
        this.angka4 = angka4;
    }

    public int getAngka3() {
        return angka3;
    }

    public int getAngka4() {
        return angka4;
    }


    public int caramengurangkan() {
        int hasil = this.angka3 - this.angka4;
        return hasil;
    }
}
