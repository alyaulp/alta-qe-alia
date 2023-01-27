import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);
        Volume Volume = new Volume();
        Berat Berat = new Berat();

        int total = 0;


        // VOLUME BALOK
        System.out.println("Masukkan Panjang barang : ");
        int Panjang = dataIn.nextInt();
        Volume.setPanjang(Panjang);

        System.out.println("Masukkan Lebar barang : ");
        int Lebar = dataIn.nextInt();
        Volume.setLebar(Lebar);

        System.out.println("Masukkan tinggi barang : ");
        int Tinggi = dataIn.nextInt();
        Volume.setTinggi(Tinggi);

        System.out.println("Volume barang = " + Volume.hitungVolume());

        if (Volume.hitungVolume() >= 50) {
            total += 5000;
        }

        // BERAT
        System.out.println("Masukkan Berat barang : ");
        int kilogram = dataIn.nextInt();
        Berat.setKilogram(kilogram);

        total += Berat.ongkir();
        System.out.println("Berat barang = " + total);
    }

}