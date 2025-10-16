import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
      //Latihan: Membuat Menu menggunakan if
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Soto Ayam");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng. Harga: Rp 15.000");
        } 
        else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam. Harga: Rp 12.000");
        } 
        else if (pilihan == 3) {
            System.out.println("Anda memilih Soto Ayam. Harga: Rp 10.000");
        } 
        else if (pilihan == 4) {
            System.out.println("Terima kasih");
        } 
        else {
            System.out.println("Pilihan tidak valid. Silakan ulangi.");
        }
    }
}
