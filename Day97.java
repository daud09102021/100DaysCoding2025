import java.util.Scanner;

public class Day97 {

    public int hitungLuas(int sisi) {
        int luas = sisi * sisi;
        return luas; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Day97 obj = new Day97();

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();

        int luas = obj.hitungLuas(sisi); 
        System.out.println("Luas persegi adalah: " + luas);
    }
}
