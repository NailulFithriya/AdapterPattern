package StrategyPattern;

public class Unorganic implements Rubbish{
    @Override
    public String getRubbish(){
        System.out.println("================================");
        System.out.println("Sampah anorganik adalah sampah yang dihasilkan dari bahan-bahan non-hayati, baik berupa produk sintetik maupun hasil proses teknologi pengolahan bahan tambang. Contohnya : plastik, botol / kaleng minuman, kresek, ban bekas, besi, kaca, kabel, barang elektronik, bohlam lampu dan sebagainya.");
        System.out.println("(Sumber: Wikipedia)");
        System.out.println();
        return "# Kategori Sampah Unorganic #";
    }
}
