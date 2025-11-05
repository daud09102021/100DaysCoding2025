import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i + 2 <= N) {
                    System.out.print(" - ");
                }
            }
        }
        System.out.println(); 
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.print(i);
                if (i - 2 >= 1) {
                    System.out.print(" - ");
                }
            }
        }
    }
}
