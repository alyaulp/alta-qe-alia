public class tabung {
    private int jarijari;
    private int tinggi;

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getJarijari() {
        return jarijari;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        double Volume;
        Volume = 22 / 7 * jarijari * jarijari * tinggi;
        return Volume;
    }

}
