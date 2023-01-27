public class persegi {
    double sisi1;
    double sisi2;

    public void setsisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public void setsisi2(double sisi1) {
        this.sisi2 = sisi2;
    }

    public double getsisi1() {
        return sisi1;
    }

    public double getsisi2() {
        return sisi2;
    }

    public double hitungLuas() {
        double hasilLuas;
        hasilLuas = sisi1 * sisi2;
        return hasilLuas;
    }

    public double hitungKeliling() {
        double hasilKeliling;
        hasilKeliling = sisi1 * 4;
        return hasilKeliling;
    }
}
