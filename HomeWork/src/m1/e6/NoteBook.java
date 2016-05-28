package m1.e6;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

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
        notes.add(new Note(text));
    }


    public void deleteNote() {

    }

    public void editNote() {

    }

    public void showAllNotes() {

        for (Note n : notes) {
            System.out.println(n.getNumber() + ") " + n.getTheme());
            System.out.println("***" + n.getText() + "***");
        }

    }

    public int getSize(){
        return notes.size();
    }
}
