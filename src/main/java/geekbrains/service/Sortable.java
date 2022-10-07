package geekbrains.service;

import geekbrains.data.Computer;

import java.util.List;

public interface Sortable<T extends Computer> {
    public List<T> sort(List<T> list);
}
