import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        String menu1 = "Nasi Goreng";
        String menu2 = "Ayam Bakar";
        String menu3 = "Es Teh Manis";
        String menu4 = "Jus Alpukat";

        int harga1 = 15000;
        int harga2 = 20000;
        int harga3 = 5000;
        int harga4 = 12000;

        
        String daftarPesanan = "";
        int totalBelanja = 0;

        boolean lanjut = true;

        while (lanjut) {

            boolean pesanLagi = true;

            while (pesanLagi) {
                
                System.out.println("\n===== MENU WARUNG SEDERHANA =====");
                System.out.println("1. " + menu1 + " - Rp " + harga1);
                System.out.println("2. " + menu2 + " - Rp " + harga2);
                System.out.println("3. " + menu3 + " - Rp " + harga3);
                System.out.println("4. " + menu4 + " - Rp " + harga4);

                
                System.out.print("Pilih menu (1-4): ");
                int pilih = input.nextInt();

                String namaMenu = "";
                int harga = 0;

                if (pilih == 1) {
                    namaMenu = menu1;
                    harga = harga1;
                } else if (pilih == 2) {
                    namaMenu = menu2;
                    harga = harga2;
                } else if (pilih == 3) {
                    namaMenu = menu3;
                    harga = harga3;
                } else if (pilih == 4) {
                    namaMenu = menu4;
                    harga = harga4;
                } else {
                    System.out.println("Menu tidak ada!");
                    continue;
                }

               
                System.out.print("Jumlah: ");
                int jumlah = input.nextInt();
                int subtotal = harga * jumlah;

               
                daftarPesanan += namaMenu + " x" + jumlah + " = Rp " + subtotal + "\n";

                
                totalBelanja += subtotal;

             
                System.out.println("\n1. Pesan menu lain");
                System.out.println("2. Lanjut ke pembayaran");
                System.out.print("Pilih: ");
                int pilih2 = input.nextInt();

                if (pilih2 == 2) {
                    pesanLagi = false;
                }
            }

           
            System.out.println("\n===== STRUK PEMBELIAN =====");
            System.out.print(daftarPesanan);
            System.out.println("---------------------------");
            System.out.println("Total Belanja: Rp " + totalBelanja);
            System.out.println("---------------------------");

            
            System.out.println("\n1. Ingin memesan lagi");
            System.out.println("2. Selesai memesan");
            System.out.print("Pilih: ");
            int akhir = input.nextInt();

            if (akhir == 1) {
                
                daftarPesanan = "";
                totalBelanja = 0;
            } else {
                System.out.println("Terima kasih");
                lanjut = false;
            }
        }


    }
}
