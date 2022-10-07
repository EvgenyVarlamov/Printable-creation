package geekbrains.controller;

import geekbrains.data.PC;
import geekbrains.service.PCService;

import java.util.List;

public class PCController {
    private PCService pcService;

    public PCController() {
        this.pcService = new PCService();
    }

    public List<PC> getSortedPSBYId(List<PC> list) {
        return pcService.sort(list);
    }

    public void PcLoggerWriter(List<PC> list) {
        pcService.print(list);
    }
}
