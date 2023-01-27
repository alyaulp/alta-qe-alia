import java.util.Scanner;

public class KoversiNilai {
    public static void main(String[] args) {
        System.out.println("Masukan Nilai:");

        Scanner input = new Scanner(System.in); // untuk membaca inputan di CLI

        int angka = input.nextInt(); // merubah Scanner menjadi variable Int

        if (angka >= 80 && angka <= 100) {
            System.out.println("Nilai A"); //menapilkan
        } else if (angka >= 65 && angka <= 79) {
            System.out.println("Nilai B+");
        } else if (angka >= 50 && angka <= 64) {
            System.out.println("Nilai B");
        } else if (angka >= 35 && angka <= 49) {
            System.out.println("Nilai C");
        } else if (angka >= 0 && angka <= 34) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Angka hanya 0-100");
        }

    }
    }


