import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        //Operator ternary
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}
