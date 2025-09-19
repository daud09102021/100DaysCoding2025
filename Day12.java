import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan Berat Badan (kg): ");
        double berat = input.nextDouble();

        // Output data
        System.out.println("\n===== BIODATA =====");
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Tinggi Badan : " + tinggi + " cm");
        System.out.println("Berat Badan  : " + berat + " kg");

        input.close();
    }
}
