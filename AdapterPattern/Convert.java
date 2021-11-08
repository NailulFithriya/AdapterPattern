/**
 * Class Convert mengimplements interface SuaraAdapter class ini berfungsi untuk
 * melakukan konversi suara
 * 
 * @author Nailul Fithriya
 * @version 08 November 2021
 */

public class Convert implements SuaraAdapter {
    // inisialisasi variabel dengan tipe Suara
    Suara voice;

    /**
     * method Convert ini adalah cunstructor dari class Convert
     * 
     * @param voice
     */
    public Convert(Suara voice) {
        this.voice = voice;
    }

    /**
     * Method getSuara adalah implementasi method getSuara yang ada di interface
     * SuaraAdapter
     */
    @Override
    public String getSuara() {
        // nilai voice.getSuara akan diberikan ke variabel suara
        String suara = voice.getSuara();
        // mereturn method ubahSuara dengan parameter variabel suara
        return ubahSuara(suara);
    }

    /**
     * Method ini untuk konversi suara bebek menjadi suara kucing
     * 
     * @param suara
     * @return kucing.hetSuara()
     */
    public String ubahSuara(String suara) {
        // membuat objek dari class Kucing
        Suara kucing = new Kucing();
        return kucing.getSuara();
    }
}
