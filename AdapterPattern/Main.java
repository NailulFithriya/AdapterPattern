
/**
 * class Main
 * 
 * @author Nailul Fithriya
 * @version 08 Agustus 2021
 */
public class Main {
    /**
     * Method Main digunakan untuk menjalankan program
     * 
     * @param args
     */
    public static void main(String[] args) {
        // membuat objek
        Suara bebek = new Bebek();
        System.out.println("Suara bebek yang asli : " + bebek.getSuara());
        SuaraAdapter bebekAdapter = new Convert(bebek);

        // print output suara bebek setelah di konversi
        System.out.println("Suara bebek setelah dikonversi : " + bebekAdapter.getSuara());
    }
}
