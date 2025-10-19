import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        // Latihan: Menentukan Gaji Bersih
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Gaji pokok: ");
        double gaji = input.nextDouble();
        System.out.print("Jam lembur: ");
        int jam = input.nextInt();
        
        int lembur = 50000;

        double gajilembur = jam * lembur;
        double gajiBersih = gajilembur + gaji;

        System.out.println("\nGaji Bersih: " + gajiBersih);
    }
}

