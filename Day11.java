import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        // Menerima Input dari Keyboard (pengenalan Scanner).

         // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.println("\n--- Data diri saya--");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Tinggi : " + tinggi + " cm");
    }
    }
