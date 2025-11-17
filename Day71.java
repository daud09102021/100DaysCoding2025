import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }

            System.out.println();
        }
    }
}