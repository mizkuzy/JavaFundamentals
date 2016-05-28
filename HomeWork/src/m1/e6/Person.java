package m1.e6;

/**
 * Class Person is a holder of notebook.
 */
public class Person {

    public static void main(String[] args) {

        NoteBook noteBook = new NoteBook();

        noteBook.addNote("text3");
        noteBook.addNote("theme4", "text4");
        noteBook.addNote("theme5", "text5");
        noteBook.addNote("text6");
        noteBook.addNote("text7");
        NoteBook.showAllNotes();

        noteBook.deleteNote(1);
        NoteBook.showAllNotes();

        noteBook.deleteNote("theme5");
        NoteBook.showAllNotes();

        noteBook.editNote(4, "", "new_text");
        NoteBook.showAllNotes();

        noteBook.editNote(4, "", "");
        NoteBook.showAllNotes();

        noteBook.editNote(5, "Theme", "");
        NoteBook.showAllNotes();

        noteBook.editNote(4, "new_Theme", "new_new");
        NoteBook.showAllNotes();
    }
}
