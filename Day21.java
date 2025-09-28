public class Day21 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Proses pertukaran tanpa variabel tambahan
        a = a + b;  
        b = a - b;  
        a = a - b;  

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
