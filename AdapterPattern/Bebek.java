/**
 * class Bebek mengimplements interface Suara
 * 
 * @author Nailul Fithriya
 * @version 08 November 2021
 */

public class Bebek implements Suara {
    /**
     * Method getSuara merupakan implemetasi dari interface Suara
     */
    @Override
    public String getSuara() {
        // mendapatkan suara bebek
        return "kwek kwek kwek";
    }
}