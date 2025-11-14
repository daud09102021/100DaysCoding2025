import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N ; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

}
