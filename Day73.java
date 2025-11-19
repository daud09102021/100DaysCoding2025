import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (;;) {
            System.out.print("Masukkan angka : ");
            int angka = input.nextInt();

           
            if (angka < 0) {
                total += Math.abs(angka); 
                break; 
            }

            total += angka;
        }

        System.out.println("Hasil : " + total);
    }
}
