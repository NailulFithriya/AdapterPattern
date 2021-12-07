

public class Tools{
    private Note tool;

    public void setTools(Note tool) {
        this.tool = tool;
    }

    public Note getTools() {
        return tool;
    }

    public void NoteTools() {
        System.out.println(tool.getNote()); 
    }
}
