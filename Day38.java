import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        // 	Latihan: Menentukan bilangan positif,negatif dan nol
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();
        if (angka == 0) {
            System.out.println("0");
        }
        else if(angka > 0) {
            System.out.println("Positif");
        }else {
            System.out.println("Negatif");
        }
    }
}
