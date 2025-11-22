public class Day76 {
    public static void main(String[] args) {
        //Method String untuk Pengecekan (equals(), equalIgnoreCase(), contains(), isEmpty()).
      
        String nama = "Daud";
        String input = "daud";

        System.out.println("equals       : " + nama.equals(input));
        System.out.println("equalsIgnore : " + nama.equalsIgnoreCase(input));
        System.out.println("contains     : " + nama.contains("au"));
        System.out.println("isEmpty      : " + nama.isEmpty());
    }
}
