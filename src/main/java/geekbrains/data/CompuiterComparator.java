package geekbrains.data;

import geekbrains.data.Computer;

import java.util.Comparator;

public class CompuiterComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o, Computer o2) {
        if (Integer.valueOf(o.getId()) > Integer.valueOf(o2.getId())) return 1;
        if (Integer.valueOf(o.getId()) < Integer.valueOf(o2.getId())) return -1;
        return 0;
    }
}
