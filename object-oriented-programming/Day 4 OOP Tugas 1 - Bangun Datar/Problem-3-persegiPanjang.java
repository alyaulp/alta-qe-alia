public class persegiPanjang {
    double panjang;
    double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double hitungLuas() {
        double hasilLuas;
        hasilLuas = panjang * lebar;
        return hasilLuas;
    }

    public double hitungKeliling() {
        double hasilKeliling;
        hasilKeliling = (2 * (panjang + lebar));
        return hasilKeliling;
    }

}

