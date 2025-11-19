import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int angka;

        while (true) {
            System.out.print("Masukkan angka : ");
            angka = input.nextInt();

            total += angka; 

            if (angka < 0) {
                break; 
            }
        }

        System.out.println("Hasil : " + total);
    }
}
