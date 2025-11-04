import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int jumlah = 0;
        int kali = 1;

        System.out.print("Penjumlahan : ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
            jumlah += i;
            if (i < N) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + jumlah);


        System.out.print("Perkalian : ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i);
            kali *= i;
            if (i > 1) {
                System.out.print("*");
            }
        }
        System.out.println(" = " + kali);
    }
}