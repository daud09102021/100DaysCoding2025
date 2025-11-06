import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Masukkan bilangan N: ");
        int N = aa.nextInt();
        System.out.print("Genap :\n");
        int Genap = 0;
        for (int i = 2; i <= N; i += 2) {
            System.out.print(i);
            Genap += i;
            if (i + 2 <= N) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + Genap);
        System.out.print("Ganjil :\n");
        int Ganjil = 0;
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.print(i);
                Ganjil += i;
                if (i - 2 > 0) {
                    System.out.print("+");
                }
            }
        }
        System.out.println(" = " + Ganjil);
    }
}
