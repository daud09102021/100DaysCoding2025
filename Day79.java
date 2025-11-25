import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BUAT AKUN BARU ===");
        System.out.print("Masukkan username baru : ");
        String username = input.nextLine();

        System.out.print("Masukkan password baru : ");
        String password = input.nextLine();

        System.out.println("\nAkun berhasil dibuat!\n");

        System.out.println("=== LOGIN ===");

        while (true) {
            System.out.print("Masukkan username : ");
            String u = input.nextLine();

            System.out.print("Masukkan password : ");
            String p = input.nextLine();

            if (!u.equals(username) && !p.equals(password)) {
                System.out.println("Username dan password salah!\n");
            } 
            else if (!u.equals(username)) {
                System.out.println("Username salah!\n");
            } 
            else if (!p.equals(password)) {
                System.out.println("Password salah!\n");
            } 
            else {
                System.out.println("Login berhasil, Selamat datang.");
                break; 
            }
        }
    }
}