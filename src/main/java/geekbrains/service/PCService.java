package geekbrains.service;

import geekbrains.data.CompuiterComparator;
import geekbrains.data.PC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class PCService implements Sortable<PC>, Printable<PC> {
    private Logger logger;

    @Override
    public List<PC> sort(List<PC> list) {
        Collections.sort(list, new CompuiterComparator());
        return null;
    }

    @Override
    public void print(List<PC> list) {
        this.logger = Logger.getAnonymousLogger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input parameter id: ");
        String parameterId = scanner.nextLine();
        List<PC> pc = pcLogOut(list, parameterId);
        logger.info(pc.toString());
        scanner.close();
    }

    private List<PC> pcLogOut(List<PC> list, String parameterId) {
        List<PC> pc = new ArrayList<>();
        for (PC p : list) {
            if (p.getId().equals(parameterId)) {
                pc.add(p);
            }
        }
        return pc;
    }
}
