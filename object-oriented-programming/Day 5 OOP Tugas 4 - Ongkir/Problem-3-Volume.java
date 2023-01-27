public class Volume {
    int Panjang;
    int Lebar;
    int Tinggi;

    public void setPanjang(int panjang) {
        Panjang = panjang;
    }

    public void setLebar(int lebar) {
        Lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        Tinggi = tinggi;
    }

    public int getPanjang() {
        return Panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public int getTinggi() {
        return Tinggi;
    }

    public int hitungVolume() {
        int Volume;
        Volume = Panjang * Lebar * Tinggi;
        return Volume;

    }

}
