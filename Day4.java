public class Day4 {
    public static void main(String[] args) {
    // \n membuat baris baru
        System.out.println("Halo\nSemua");

        // \t membuat tab 
        System.out.println("Nama:\tDaud\tPelajar");

        // \" menampilkan tanda kutip ganda "
        System.out.println("kata dosen: \"Belajarlah dengan rajin!\"");

        // \' menampilkan tanda kutip tunggal '
        System.out.println("Contoh kutip tunggal: \'A\'");

        // \\ menampilkan tanda backslash \
        System.out.println("Lokasi file: C:\\Users\\Daud\\Documents");

        // \r mengembalikan kursor ke awal baris, teks sebelumnya bisa tertimpa
        System.out.println("Halo\rSemua"); 
        // Output yang terlihat: Dunia

        // \b menghapus satu karakter sebelumnya
        System.out.println("AB\bC"); // Output: AC

        // \f jarang terlihat di konsol, biasanya dipakai di printer)
        System.out.println("Halo\fSemua"); 
        // Output: HaloSemua (dengan form feed)

        // \ uXXXX Unicode 
        System.out.println("simbol senyum : \u263A"); // ☺
    
    }
}
