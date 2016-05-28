package m1.e6;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    private static final String DEFAULT_THEME = "NO THEME";
    private List<Note> notes = new ArrayList<>();

    /**
     * Adds new note with parameter text and default theme.
     *
     * @param text of note
     */
    public void addNote(String text) {
        notes.add(new Note(text));
    }

    /**
     * Adds new note with parameter text and theme.
     *
     * @param text of note
     */
    public void addNote(String theme, String text) {
        notes.add(new Note(theme, text));
    }

    /**
     * Deletes note by number.
     */
    public void deleteNote(int number) {
        notes.remove(number - 1);
    }

    /**
     * Deletes note by theme.
     */
    public void deleteNote(String theme) {
        int number = -1;
        for (Note n : notes) {
            if (n.getTheme().equals(theme)) {
                number = n.getNumber() - 1;
                break;
            }
        }
        if (number != -1) {
            notes.remove(number);
        }
    }

    /**
     * Deletes all notes without theme.
     */
    public void deleteNoteWithNoTheme() {
        ArrayList<Integer> indexes = findNoThemeNotes();
        for (int i: indexes){
            notes.remove(i);
        }

    }



    private ArrayList findNoThemeNotes() {
        ArrayList<Integer> indexes = new ArrayList();
        for (Note n : notes) {
            if (n.getTheme().equals(DEFAULT_THEME)){
                indexes.add(n.getNumber()-1);
            }
        }

        return indexes;
    }

    public void editNote() {

    }

    public void showAllNotes() {
        System.out.println("Amount of notes: " + notes.size());
        for (Note n : notes) {
            System.out.println(n.getNumber() + ") " + n.getTheme() +
                    ": " + n.getText() + ".");
        }

    }

    public int getSize() {
        return notes.size();
    }

    public List<Note> getNotes() {
        return notes;
    }
}
