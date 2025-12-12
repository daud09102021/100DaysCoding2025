import java.util.Scanner;

public class Day96 {
    int tambah(int a, int b) {
        return a + b;
    }

    int kurang(int a, int b) {
        return a - b;
    }

    int kali(int a, int b) {
        return a * b;
    }

    double bagi(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day96 k = new Day96();

        System.out.print("Masukkan angka pertama : ");
        int x = sc.nextInt();

        System.out.print("Masukkan angka kedua   : ");
        int y = sc.nextInt();

        System.out.println("Penjumlahan  = " + k.tambah(x, y));
        System.out.println("Pengurangan  = " + k.kurang(x, y));
        System.out.println("Perkalian    = " + k.kali(x, y));
        System.out.println("Pembagian    = " + k.bagi(x, y));
    }
}
