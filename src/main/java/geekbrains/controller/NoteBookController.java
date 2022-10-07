package geekbrains.controller;

import geekbrains.data.NoteBook;
import geekbrains.service.NotebookService;

import java.util.List;

public class NoteBookController {
    private NotebookService notebookService;

    public NoteBookController() {
        this.notebookService = new NotebookService();
    }

    public List<NoteBook> getSortedNotebookById(List<NoteBook> list) {
        return notebookService.sort(list);
    }

    public void NoteBookloggerWriter(List<NoteBook> list) {
        notebookService.print(list);
    }

}
