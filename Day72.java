import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int s = 1; s <= N - i; s++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= i; b++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
