package m1.e6;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    private static List<Note> notes = new ArrayList<>();

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

        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getTheme().equals(theme)) {
                number = i;
                break;
            }
        }
        if (number != -1) {
            notes.remove(number);
        }
    }

    public void editNote(int number, String theme, String text) {
        Note note = getNote(number);
        if (note == null) {
            System.out.println("Note with this number was not find. ");
            return;
        }
        if (!(theme.equals(""))) {
            note.setTheme(theme);
        }
        if (!(text.equals(""))) {
            note.setText(text);
        }
    }

    private Note getNote(int number) {
        for (Note n : notes) {
            if (n.getNumber() == number) return n;
        }
        return null;
    }

    public static void showAllNotes() {
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
