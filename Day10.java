public class Day10 {
    public static void main(String[] args) {
        //Constanta (Final Variabel)
        
        // Deklarasi konstanta dengan final
        final String nama = "Daud";
        final int umur = 20;

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");

        // Jika mencoba mengubah nilainya → ERROR
        // umur = 25;   //  Tidak boleh karena final
    }
}


