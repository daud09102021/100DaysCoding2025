import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
      //Latihan: Membuat Program Ganjil Genap menggunakan ternary
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Bilangan " + angka + " adalah " + hasil);
    }
}
