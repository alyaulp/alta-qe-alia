import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);
        penjumlajan penjumlajan = new penjumlajan();
        Pengurangan penguragan = new Pengurangan();

        // PENJUMLAHAN
        System.out.println("Masukan Angka1 penjumlahan");
        int angka1 = dataIn.nextInt();
        penjumlajan.setAngka1(angka1);


        System.out.println("Masukan Angka2 penjumlahan");
        int angka2 = dataIn.nextInt();
        penjumlajan.setAngka2(angka2);
        System.out.println("Jumlah = " + penjumlajan.caramenjumlahkan());

        // PENGURANGAN
        System.out.println("Masukan Angka3 pengurangan");
        int angka3 = dataIn.nextInt();
        penguragan.setAngka3(angka3);


        System.out.println("Masukan Angka4 pengurangan");
        int angka4 = dataIn.nextInt();
        penguragan.setAngka4(angka4);
        System.out.println("Jumlah = " + penguragan.caramengurangkan());
    }


}