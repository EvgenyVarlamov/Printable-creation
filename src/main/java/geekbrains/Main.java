package geekbrains;

import geekbrains.controller.NoteBookController;
import geekbrains.controller.PCController;
import geekbrains.data.Memory;
import geekbrains.data.NoteBook;
import geekbrains.data.PC;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PC> pc = new ArrayList<>();
        pc.add(new PC("1", "Asus", Memory.SIXTEEN, "1024", 1200));
        pc.add(new PC("2", "Aсer", Memory.SIXTEEN, "512", 1000));
        pc.add(new PC("3", "Lenovo", Memory.EIGHT, "256", 450));
        pc.add(new PC("4", "Irbis", Memory.ONE, "128", 200));
        pc.add(new PC("5", "Dell", Memory.EIGHT, "256", 500));
        pc.add(new PC("6", "Dell", Memory.TWO, "256", 240));

        PCController pcController = new PCController();
        pcController.PcLoggerWriter(pc);
    }
}
