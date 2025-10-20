import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (a % 3 == 0 && a % 5 ==0) {
            System.out.println("Kelipatan 3 dan 5");
        }else if (a % 3 == 0) {
            System.out.println("Kelipatan 3");
        }else if (a % 5 == 0) {
            System.out.println("Kelipatan 5");      
        }else{
            System.out.println("Tidak masuk dalam kategori");
        }
    }
}
