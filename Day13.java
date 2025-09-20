import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai a : ");
        int a = input.nextInt();

        System.out.println("Masukkan nilai b : ");
        int b = input.nextInt();

        System.out.println("Nilai awal  = ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    
        int c = a;
        a = b;
        b = c;
        System.out.println("Nilai setelah ditukar = ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
