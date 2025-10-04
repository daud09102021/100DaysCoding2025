import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Panjang : ");
        int panjang = sc.nextInt();

        System.out.print("Lebar : ");
        int lebar = sc.nextInt();

        int keramik = panjang * lebar / (2*2);

        System.out.println("Jumlah keramik : " + keramik);
    }
}
