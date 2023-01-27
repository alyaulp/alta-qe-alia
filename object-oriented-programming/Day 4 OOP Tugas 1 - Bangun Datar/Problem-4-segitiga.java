public class segitiga {

    private int alas;
    private int tinggi;
    private int sisia;
    private int sisib;
    private int sisic;

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisia(int sisia) {
        this.sisia = sisia;
    }

    public void setSisib(int sisib) {
        this.sisib = sisib;
    }

    public void setSisic(int sisic) {
        this.sisic = sisic;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getSisia() {
        return sisia;
    }

    public int getSisib() {
        return sisib;
    }

    public int getSisic() {
        return sisic;
    }

    public double hitungLuas() {
        double luas;
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public double hitungKetliling() {
        double keliling = sisia + sisib * sisic;
        return keliling;
    }

}

