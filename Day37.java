import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        // 	Latihan: Menentukan bilangan ganjil atau genap
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();
        if (angka == 0) {
            System.out.println("0");
        }else if(angka % 2 == 0) {
            System.out.println("Genap");
        }else {
            System.out.println("Ganjil");
        }
    }
}
