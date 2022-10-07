package geekbrains.service;

import geekbrains.data.Computer;

import java.util.List;

public interface Printable<T extends Computer> {
    public void print(List<T> list);
}
