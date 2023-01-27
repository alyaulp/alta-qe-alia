import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dataIn = new Scanner(System.in);
        segitiga segitiga = new segitiga();
        persegi persegi = new persegi();

        // LUAS SEGiTIGA
        System.out.println("Masukkan Alas Segitiga : ");
        int a = dataIn.nextInt();
        segitiga.setAlas(a);

        System.out.println("Masukkan Tinggi Segitiga : ");
        int t = dataIn.nextInt();
        segitiga.setTinggi(t);

        System.out.println("Luas Segitiga = " + segitiga.hitungLuas());

        // KELILING SEGITIGA
        System.out.println("Masukan sisia");
        int sisia = dataIn.nextInt();
        segitiga.setSisia(sisia);

        System.out.println("Masukan sisib");
        int sisib = dataIn.nextInt();
        segitiga.setSisib(sisib);

        System.out.println("Masukan sisic");
        int sisic = dataIn.nextInt();
        segitiga.setSisic(sisic);

        System.out.println("Keliling Segitiga = " + segitiga.hitungKetliling());

        // LUAS PERSEGI
        System.out.println("Masukkan Sisi Persegi pertama : ");
        double sisi1 = dataIn.nextDouble();
        persegi.setsisi1(sisi1);
        System.out.println("Masukkan Sisi Persegi kedua : ");
        double sisi2 = dataIn.nextInt();
        persegi.setsisi2(sisi2);

        System.out.println("Luas Persegi = " + persegi.hitungLuas());

        // KELILING PERSEGI
        System.out.println("Masukkan Sisi Persegi : ");
        double sisi = dataIn.nextDouble();
        persegi.setsisi1(sisi);

        System.out.println("Keliling Persegi = " + persegi.hitungKeliling());
    }

}
