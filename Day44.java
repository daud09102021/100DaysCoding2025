import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        // Latihan program predikat Nilai(A,B,C,D,E)
        Scanner input = new Scanner(System.in);

        int nilai = input.nextInt();

        if(nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai A");
        }else if (nilai >= 75 && nilai <= 84) {
            System.out.println("Nilai B");
        }else if (nilai >= 60 && nilai <= 74) {
            System.out.println("Nilai C");
        }else {
            System.out.println("Nilai E");
        }
    }
}
