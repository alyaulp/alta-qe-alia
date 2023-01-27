public class Kubus {
    private int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public double hitungVolume() {
        double Volume;
        Volume = sisi * 3;
        return Volume;
    }
}
