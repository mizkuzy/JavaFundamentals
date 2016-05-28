package m1.e6;

public class Note {

    private static int noteCount = 0;

    private int number;
    private String theme;
    private String text;

    public Note(String theme, String text) {
        number = ++noteCount;
        this.theme = theme;
        this.text = text;
    }

    public Note(String text) {
        number = ++noteCount;
        theme = "NO THEME";
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public void editTheme(String new_theme) {
        theme = new_theme;
    }

    public void editText(String new_text) {
        text = new_text;
    }
}
