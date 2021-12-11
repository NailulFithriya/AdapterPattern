import java.util.Scanner;

import AdapterPattern.*;
import StrategyPattern.*;

public class Main {
    private static Scanner input;
    private static Scanner pilih;
    private static Scanner menu;
    private static Scanner jumlah;
    public static void main(String[] args) {

        System.out.println("Menu Program");
        System.out.println("1. Edukasi seputar sampah");
        System.out.println("2. Jual Sampah\n");

        System.out.print("Pilihan : ");

        pilih = new Scanner(System.in);
        int two = pilih.nextInt();

        if(two == 1){
            System.out.println("\nPilihlah kategori sampah");
            System.out.println("1. Organic");
            System.out.println("2. Unorganic\n");
            System.out.print("Pilihan : ");

            input = new Scanner(System.in);
            int rubbish = input.nextInt();

            RubbishBin sampah = null;
            sampah = new RubbishBin();

            if (rubbish == 1) {
                sampah.setRubbishBin(new Organic());
                sampah.TakeRubbish();
                System.out.println();
            } else if (rubbish == 2) {
                sampah.setRubbishBin(new Unorganic());
                sampah.TakeRubbish();

                System.out.println();
            } else {
                System.out.println("Mohon Maaf Tools yang anda pilih tidak tersedia");
            }
        }else if(two == 2){
            System.out.println("Sampah Apa yang ingin dijual?");
            System.out.println("1. Besi dan sejenisnya");
            System.out.println("2. Kardus");
            System.out.println("3. Koran");
            System.out.println("4. Aqua Gelas\n");

            System.out.print("Pilihan : ");

            menu = new Scanner(System.in);
            int sampah = menu.nextInt();

            System.out.print("Masukkan jumlah sampah (kg): ");
            jumlah = new Scanner(System.in);
            int total = jumlah.nextInt();


            if(sampah == 1){
                AdapterJualSampah besi = new Besi();
                AdapterJualSampah besiAdapter = new TongSampah(besi, total);
                System.out.println("Harga besi = " +besiAdapter.getRubbishBin());

            }
            else if(sampah == 2){
                AdapterJualSampah kardus = new Kardus();
                AdapterJualSampah kardusAdapter = new TongSampah(kardus, total);
                System.out.println("Harga kardus = " +kardusAdapter.getRubbishBin());
            }
            else if(sampah == 3){
                AdapterJualSampah koran = new Koran();
                AdapterJualSampah koranAdapter = new TongSampah(koran, total);
                System.out.println("Harga koran = " +koranAdapter.getRubbishBin());
            }
            else if(sampah == 4){
                AdapterJualSampah aquaGelas = new Aquagelas();
                AdapterJualSampah aquaGelasAdapter = new TongSampah(aquaGelas, total);
                System.out.println("Harga botol Aqua gelas = " +aquaGelasAdapter.getRubbishBin());
            }
        }
    }
}
