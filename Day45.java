import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
      //Percabangan (switch-case)
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka 1-3: ");
        int angka = input.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Anda memilih angka SATU");
                break;
            case 2:
                System.out.println("Anda memilih angka DUA");
                break;
            case 3:
                System.out.println("Anda memilih angka TIGA");
                break;
            default:
                System.out.println("Angka tidak dikenal");
        }
    }
}
