public class Day95 {
    void cetakNama(String nama) {
        System.out.println("Nama saya: " + nama);
    }
    void cetakUmur(int umur) {
        System.out.println("Umur saya: " + umur + " tahun");
    }
    public static void main(String[] args) {
        Day95 obj = new Day95();

        obj.cetakNama("Daud");
        obj.cetakUmur(20);
    }
}
