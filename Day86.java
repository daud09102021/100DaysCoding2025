public class Day86 {
    public static void main(String[] args) {

        int[] angka = {12, 7, 5, 20, 3, 9};
        int min = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka minimal adalah: " + min);
    }
}
