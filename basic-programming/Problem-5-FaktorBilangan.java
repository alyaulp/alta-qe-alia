import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        System.out.println("Masukan Nilai:");

        Scanner input = new Scanner(System.in); // untuk membaca inputan di CLI
        int angka = input.nextInt(); // merubah Scanner menjadi variable Int

        for (int i=1; i<= angka; i++) {
            if (angka%i == 0) {
                System.out.println(i);
            }


        }


    }
    }


