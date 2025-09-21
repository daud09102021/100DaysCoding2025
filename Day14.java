public class Day14 {
    public static void main(String[] args) {

        // Mengubah String menjadi Tipe Data Primitif	
        
        String strInt = "100";
        String strDouble = "3.14";
        String strBoolean = "true";

        // Ubah ke tipe data primitif
        int angkaInt = Integer.parseInt(strInt);     
        double angkaDouble = Double.parseDouble(strDouble); 
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean); 

        System.out.println("String ke int: " + angkaInt);
        System.out.println("String ke double: " + angkaDouble);
        System.out.println("String ke boolean: " + nilaiBoolean);
    }
}

