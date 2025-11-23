
public class Day77 {
    public static void main(String[] args) {

        // Method String untuk Manipulasi (substring(), replace(), trim()).
        String a = "Belajar ngoding";
        String b = "    Java Mantap   ";

        System.out.println("Teks asli a : " + a);
        System.out.println("Teks asli b : " + b);

        System.out.println(a.substring(0, 7));  

        System.out.println(b.replace("Mantap", "Gacor"));

        System.out.println(b.trim());
    }
}