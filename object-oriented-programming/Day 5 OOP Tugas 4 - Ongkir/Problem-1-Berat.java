public class Berat extends Volume {
    int kilogram;

    public void setKilogram(int kilogram) {
        this.kilogram = kilogram;
    }

    public int getKilogram() {
        return kilogram;
    }

    public int ongkir() {
        int hasil = kilogram * 5000;
        return hasil;
    }
}
