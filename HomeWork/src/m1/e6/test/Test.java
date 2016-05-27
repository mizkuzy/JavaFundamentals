package m1.e6.test;

import m1.e6.NoteBook;

public class Test {
    static NoteBook noteBook = new NoteBook();

    private static void addNoteSuccess() {
        int sizeBeforeTest = noteBook.getSize();
        noteBook.addNote("Text");
        int sizeAfterTest = noteBook.getSize();
        if (sizeAfterTest>sizeBeforeTest){
            System.out.println("Note successfully added.");;
        } else System.out.println("TEST FAILED. Note didn't added.");
    }

    private void showAllNotesSuccess() {

    }

    public static void main(String[] args) {
        Test.addNoteSuccess();
    }
}
