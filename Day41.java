import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan:");
        int bilangan = input.nextInt();

        if (bilangan %3==0 && bilangan %5==0) {
            System.out.println("master class");
        }else if(bilangan % 3==0) {
            System.out.println("pride of 3");
        }else if(bilangan % 5==0) {
            System.out.println("pride of 5");
        }else {
            System.out.println("tidak termasuk kategori");
        }

        }
    }
