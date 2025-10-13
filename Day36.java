import java.util.Scanner;

public class Day36 {
  public static void main(String[] args) {
    // Nested if
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan umur kamu: ");
        int umur = input.nextInt();

        if (umur >= 18) {
            System.out.println("Kamu sudah dewasa.");

            if (umur >= 60) {
                System.out.println("Kamu sudah lanjut usia.");
            }
        } else {
            System.out.println("Kamu masih anak-anak.");
     }
  }
} 
