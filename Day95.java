public class LatihanCetak {
    void cetakNama(String nama) {
        System.out.println("Nama saya: " + nama);
    }
    void cetakUmur(int umur) {
        System.out.println("Umur saya: " + umur + " tahun");
    }
    public static void main(String[] args) {
        LatihanCetak obj = new LatihanCetak();

        obj.cetakNama("Daud");
        obj.cetakUmur(20);
    }
}
