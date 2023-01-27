public class balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        double Volume;
        Volume = panjang * lebar * tinggi;
        return Volume;
    }

}
