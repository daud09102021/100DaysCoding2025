import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang : ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Lebar : ");
        int lebar = input.nextInt();

        for (int i = 0; i < panjang; i++) {
            System.out.print("|");
            for (int j = 0; j < lebar; j++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }
}