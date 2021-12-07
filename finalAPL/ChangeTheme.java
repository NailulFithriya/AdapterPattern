/**
 * class ini digunakan untuk proses ganti tema
 */
public class ChangeTheme implements AdapterColor{
    private AdapterColor theme;

    public ChangeTheme(AdapterColor theme){
        this.theme = theme;
    }

    @Override
    public String getTheme(){
        String tema = theme.getTheme();
        return ubahTema(tema);
    }

    //mengganti tema light menjadi dark
    public String ubahTema(String Tema){
        AdapterColor tema = new Dark();
        return tema.getTheme();
    }
    
}
