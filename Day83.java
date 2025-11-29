import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sesi = input.nextInt();

        int totalJam = 0;
        int totalMenit = 0;
        int totalDetik = 0;

        for (int i = 1; i <= sesi; i++) {
            System.out.println("Sesi ke-" + i);

            System.out.print("Jam   : ");
            int jam = input.nextInt();

            System.out.print("Menit : ");
            int menit = input.nextInt();

            System.out.print("Detik : ");
            int detik = input.nextInt();

        
            totalJam += jam;
            totalMenit += menit;
            totalDetik += detik;
        }


        if (totalDetik >= 60) {
            totalMenit += totalDetik / 60;
            totalDetik = totalDetik % 60;
        }


        if (totalMenit >= 60) {
            totalJam += totalMenit / 60;
            totalMenit = totalMenit % 60;
        }


        System.out.println("\nTotal : " + totalJam + " jam " + totalMenit + " menit " + totalDetik + " detik");


        if (totalJam > 24) {
            System.out.println("Seppuh");
        } else if (totalJam >= 8) {
            System.out.println("Abang Jago");
        } else {
            System.out.println("Kapan Jagonya?");
        }
    }
}
