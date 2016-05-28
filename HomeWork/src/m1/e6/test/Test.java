package m1.e6.test;

import m1.e6.Note;
import m1.e6.NoteBook;

import java.util.List;

public class Test {
    private static final String THEME_TEST = "THEME_TEST";
    private static final String NO_SUCH_THEME_TEST = "NO_SUCH_THEME";
    private static final int NOTE_NUMBER = 3;
    static NoteBook noteBook = new NoteBook();

    /**
     * Тестируем добавление записи в блокнот без темы.
     */
    private static void addNoteWithTextSuccess() {
        System.out.println("TEST. addNoteWithTextSuccess()");
        int sizeBeforeTest = noteBook.getSize();
        noteBook.addNote("Text1");
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest > sizeBeforeTest) {
            System.out.println("TEST SUCCESS. Note was successfully added.");
        } else System.out.println("TEST FAILED. Note wasn't added.");
    }

    /**
     * Тестируем добавление записи в блокнот с темой.
     */
    private static void addNoteWithTextAndThemeSuccess() {
        System.out.println("TEST. addNoteWithTextAndThemeSuccess()");
        int sizeBeforeTest = noteBook.getSize();
        noteBook.addNote("Theme", "Text2");
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest > sizeBeforeTest) {
            System.out.println("TEST SUCCESS. Note was successfully added.");
        } else System.out.println("TEST FAILED. Note wasn't added.");
    }

    /**
     * Тестируем удаление записи из блокнота по теме.
     */
    private static void deleteNoteByThemeSuccess() {
        System.out.println("TEST. deleteNoteByThemeSuccess()");
        int sizeBeforeTest = noteBook.getSize();
        noteBook.deleteNote(THEME_TEST);
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest < sizeBeforeTest) {
            System.out.println("TEST SUCCESS. Note was successfully deleted.");
        } else System.out.println("TEST FAILED. Note wasn't deleted.");
    }

    /**
     * Тестируем удаление записи из блокнота по теме, которой не существует.
     * <p>
     * <p>Удаления не должно произойти.</p>
     */
    private static void deleteNoteByThemeFail() {
        System.out.println("TEST. deleteNoteByThemeFail()");
        int sizeBeforeTest = noteBook.getSize();
        noteBook.deleteNote(NO_SUCH_THEME_TEST);
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest == sizeBeforeTest) {
            System.out.println("TEST SUCCESS. Note was not deleted, because there is no note with given theme.");
        } else System.out.println("TEST FAILED.");
    }

    /**
     * Тестируем удаление записи из блокнота по номеру.
     */
    private static void deleteNoteByNumber() {
        System.out.println("TEST. deleteNoteByNumber()");
        int sizeBeforeTest = noteBook.getSize();
        noteBook.deleteNote(NOTE_NUMBER);
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest >= sizeBeforeTest) {
            System.out.println("TEST FAILED. Note was not deleted");
            return;
        }

        for (Note n : noteBook.getNotes()) {
            if (n.getNumber() == NOTE_NUMBER) {
                System.out.println("TEST FAILED. There was find deleted number.");
                break;
            }
        }
        System.out.println("TEST SUCCESS. Note was deleted by number.");
    }

    /**
     * Тестируем редактирование записи.
     */
    private static void editThemeSuccess() {
        System.out.println("TEST. editThemeSuccess()");
        List<Note> notes = noteBook.getNotes();
        Note note = notes.get(3);
        String theme = note.getTheme();
        System.out.println("THEME of tested note before editing: " + theme);
        note.setTheme("New_Theme");
        System.out.println("THEME of tested note after editing: " + note.getTheme());
        if (theme.equals(note.getTheme())){
            System.out.println("TEST FAILED. Theme was not changed");
        } else System.out.println("TEST SUCCESS. Theme was changed.");
    }

    private static void editTextSuccess() {
        System.out.println("TEST. editTextSuccess()");
        List<Note> notes = noteBook.getNotes();
        Note note = notes.get(3);
        String text = note.getText();
        System.out.println("Text of tested note before editing: " + text);
        note.setText("New_Text");
        System.out.println("Text of tested note after editing: " + note.getText());
        if (text.equals(note.getText())){
            System.out.println("TEST FAILED. Text was not changed");
        } else System.out.println("TEST SUCCESS. Text was changed.");
    }
    public static void main(String[] args) {
        Test.addNoteWithTextSuccess();
        Test.addNoteWithTextAndThemeSuccess();

        noteBook.addNote("text3");
        noteBook.addNote(THEME_TEST, "text4");
        noteBook.addNote("theme5", "text5");
        noteBook.addNote("text6");
        noteBook.addNote("text7");

        deleteNoteByThemeSuccess();
        deleteNoteByThemeFail();
        deleteNoteByNumber();

        editThemeSuccess();
        editTextSuccess();
    }



}
