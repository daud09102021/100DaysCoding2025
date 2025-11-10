import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int M = input.nextInt();

        System.out.print("Masukkan Pangkat : ");
        int N = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }
        System.out.println(hasil);
    }
}
