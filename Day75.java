import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        System.out.println("Panjang karakter : " + teks.length());
        System.out.println("Uppercase        : " + teks.toUpperCase());
        System.out.println("Lowercase        : " + teks.toLowerCase());
    }
}