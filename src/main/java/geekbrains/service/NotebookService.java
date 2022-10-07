package geekbrains.service;

import geekbrains.data.CompuiterComparator;
import geekbrains.data.NoteBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class NotebookService implements Sortable<NoteBook>, Printable<NoteBook> {
    private Logger logger;

    @Override
    public List<NoteBook> sort(List<NoteBook> list) {
        Collections.sort(list, new CompuiterComparator());
        return list;
    }

    @Override
    public void print(List<NoteBook> list) {
        this.logger = Logger.getAnonymousLogger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input parameter id: ");
        String parameterId = scanner.nextLine();
        List<NoteBook> noteBook = NoteBooklogOut(list, parameterId);
        logger.info(noteBook.toString());
        scanner.close();
    }

    private List<NoteBook> NoteBooklogOut(List<NoteBook> list, String parameterId) {
        List<NoteBook> noteBook = new ArrayList<>();
        for (NoteBook note : list) {
            if (note.getId().equals(parameterId)) {
                noteBook.add(note);
            }
        }
        return noteBook;
    }
}

