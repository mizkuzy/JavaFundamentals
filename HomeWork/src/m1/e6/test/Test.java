package m1.e6.test;

import m1.e6.NoteBook;

public class Test {
    static NoteBook noteBook = new NoteBook();

    private static void addNoteWithTextSuccess() {
        int sizeBeforeTest = noteBook.getSize();
        noteBook.addNote("Text");
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest>sizeBeforeTest){
            System.out.println("Note successfully added.");;
        } else System.out.println("TEST FAILED. Note didn't added.");
    }

    private static void addNoteWithTextAndThemeSuccess() {
        int sizeBeforeTest = noteBook.getSize();
        noteBook.addNote("Theme","Text");
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest>sizeBeforeTest){
            System.out.println("Note successfully added.");;
        } else System.out.println("TEST FAILED. Note didn't added.");
    }

    private void showAllNotesSuccess() {

    }

    public static void main(String[] args) {
        Test.addNoteWithTextSuccess();
        Test.addNoteWithTextAndThemeSuccess();
    }
}
