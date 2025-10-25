import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        // Latihan: Membuat Kalkulator Menggunakan Switch-case 
        Scanner input = new Scanner(System.in);
        double hasil;
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Pilih operator +, -, *, /, %: ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '%':
                hasil = angka1 % angka2;
                System.out.println("Hasil:" + hasil);
                break;
            default:
                System.out.println("Operator tidak dikenal!");
        }

        input.close();
    }
}

