
import java.util.Scanner;

public class Main {
    private static Scanner input;
    public static void main(String[] args) {

        System.out.println("Pilihlah tools yang ingin dipakai : OneNote atau Notepad");
        System.out.print("Pilihan : ");

        input = new Scanner(System.in);
        String tool = input.next();
        System.out.println("Tools yang anda pakai adalah : " + tool);

        Tools alat = null;
        alat = new Tools();

        if ("OneNote".equalsIgnoreCase(tool)) {
            alat.setTools(new OneNote());
            alat.NoteTools();
            System.out.println();
        } else if ("NotePad".equalsIgnoreCase(tool)) {
            alat.setTools(new NotePad());
            alat.NoteTools();
            System.out.println();
        } else {
            System.out.println("Mohon Maaf Tools yang anda pilih tidak tersedia");
        }

        System.out.println("Apakah anda ingin mengganti tema? (y/n)");
        System.out.print("Pilihan : ");
        String pilih = input.next();

        if(pilih.equals("y")){
            AdapterColor color = new Light();
            System.out.println("Tema Sebelumnya : " + color.getTheme());
    
            System.out.println("\nMengganti Tema . . .");
            AdapterColor gantiTema = new ChangeTheme(color);
            System.out.println("Tema Setelah diganti : " + gantiTema.getTheme());
        }
    }
}
