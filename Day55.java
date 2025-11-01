import java.util.Scanner;

public class Day55 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Batas atas :");
        int atas = input.nextInt();
        System.out.println("Batas bawah :");
        int bawah = input.nextInt();
        System.out.println("Angka :");
        int angka = input.nextInt();

        if(atas > angka && bawah < angka) {
            System.out.println("YAYAYAYA");
        }else {
            System.out.println("NONONONO");
        }
   } 
}
