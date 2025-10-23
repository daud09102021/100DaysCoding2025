import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        // Latihan: Membuat Menu Menggunakan Switch-case
        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.println("===== MENU MAKANAN =====");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Ayam    - Rp12.000");
        System.out.print("Pilih menu :");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah porsi: ");
        int jumlah = input.nextInt();

        switch (pilihan) {
            case 1:
                total = 15000 * jumlah; 
                System.out.println("Anda memilih Nasi Goreng (" + jumlah + " porsi)");
                System.out.println("Total bayar: Rp" + total);
                break;

            case 2:
                total = 12000 * jumlah; 
                System.out.println("Anda memilih Mie Ayam (" + jumlah + " porsi)");
                System.out.println("Total bayar: Rp" + total);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}

