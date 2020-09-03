package ua.alevel.homework;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> books = new ArrayList<>();

    public void addAll(List<T> list) {
        books.addAll(list);
    }

    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();
        List<String> albums = new ArrayList<>();

        albums.add("Harry Potter");
        albums.add("Sleeping beauty");
        albums.add("Winnie-the-Pooh");

        storage.addAll(albums);
        storage.books.forEach(System.out::println);
    }
}