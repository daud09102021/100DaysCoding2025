public class Day20 {
    public static void main(String[] args) {
           int angka = 10;

          // Cara 1: String.valueOf()
         String s1 = String.valueOf(angka);

          // Cara 2: Integer.toString()
          String s2 = Integer.toString(angka);

         // Cara 3: Menggabungkan dengan String
         String s3 = angka + "";

         System.out.println("Cara 1: " + s1);
         System.out.println("Cara 2: " + s2);
         System.out.println("Cara 3: " + s3);

        
    }
}
