/**
 * class Kucing mengimplemetns interface Suara
 * 
 * @author Nailul Fithriya
 * @version 08 November 2021
 */

public class Kucing implements Suara {

    /**
     * Method getSuara merupakan implemetasi dari interface Suara
     */
    @Override
    public String getSuara() {
        // mendapatkan suara kucing
        return "Meow meow meow";
    }
}
