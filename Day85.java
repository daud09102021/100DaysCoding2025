public class Day85 {
    public static void main(String[] args) {
        
        int data[] = {12, 5, 44, 7, 29, 3, 55, 18};

        int max = data[0]; 

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];  
            }
        }

        System.out.println("Angka terbesar dalam array adalah: " + max);
    }
}
