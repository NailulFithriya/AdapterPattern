package StrategyPattern;

public class Organic implements Rubbish{
    @Override
    public String getRubbish(){
        System.out.println("================================");
        System.out.println("Sampah organik adalah sampah yang berasal dari sisa mahkluk hidup yang mudah terurai secara alami tanpa proses campur tangan manusia untuk dapat terurai. Contohnya adalah dedaunan dan sebagainya");
        System.out.println("sumber: https://dlh.bulelengkab.go.id/informasi/detail/artikel/pengertian-dan-pengelolaan-sampah-organik-dan-anorganik-13\n");
        return "# Kategori sampah organic #";
    }
}
