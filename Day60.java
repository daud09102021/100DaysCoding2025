import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();

        int Genap = 0;
        int Ganjil = 0;
        System.out.print("Genap :\n");
        for (int i = 2; i <= N; i += 2) {
            System.out.print(i);
            Genap += i;
            if (i + 2 <= N) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + Genap);
        System.out.print("Ganjil :\n");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.print(i);
                Ganjil += i;
                if (i > 1) {
                    int j = i - 2;
                    if (j >= 1) {
                        System.out.print("+");
                    }
                }
            }
        }
        System.out.println(" = " + Ganjil);
    }
}
