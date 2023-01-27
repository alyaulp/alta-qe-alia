import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);
        balok balok = new balok();
        Kubus Kubus = new Kubus();
        tabung tabung = new tabung();

        // VOLUME BALOK
        System.out.println("Masukkan Panjang balok : ");
        int p = dataIn.nextInt();
        balok.setPanjang(p);

        System.out.println("Masukkan Lebar balok : ");
        int l = dataIn.nextInt();
        balok.setLebar(l);

        System.out.println("Masukkan tinggi balok : ");
        int t = dataIn.nextInt();
        balok.setTinggi(t);

        System.out.println("Volume balok = " + balok.hitungVolume());

        // VOLUME KUBUS
        System.out.println("Masukan sisi Kubus");
        int sisi = dataIn.nextInt();
        Kubus.setSisi(sisi);

        System.out.println("Volume Kubus = " + Kubus.hitungVolume());

        // VOLUME TABUNG
        System.out.println("Masukkan jarijari tabung : ");
        int jarijari = dataIn.nextInt();
        tabung.setJarijari(jarijari);

        System.out.println("Masukkan tinggi tabung : ");
        int tinggi = dataIn.nextInt();
        tabung.setTinggi(tinggi);

        System.out.println("Volume tabung = " + tabung.hitungVolume());


    }


}