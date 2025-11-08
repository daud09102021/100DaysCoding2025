import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int N = input.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            jumlah += i;
            System.out.print(i);
            if (i < N) {
                System.out.print("+");
            }
        }

        System.out.println(" = " + jumlah);
    }
}
