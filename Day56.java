import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int percobaan = 0;
        boolean login = false;

        do {
            System.out.print("Username : ");
            username = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (username.equals("Daud") && password.equals("D0224322")) {
                System.out.println("Login Sebagai Pengguna");
                login = true;
            } 
            else if (username.equals("admin") && password.equals("admin")) {
                System.out.println("Anda Login Sebagai Admin");
                login = true;
            } 
            else {
                System.out.println("Silahkan Coba Lagi");
                percobaan++;
            }

        } while (percobaan < 3 && !login);
        if (!login) {
            System.out.println("Login Gagal");
        }
    }
}


