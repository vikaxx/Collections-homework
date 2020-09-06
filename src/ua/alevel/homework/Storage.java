package ua.alevel.homework;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Book> {
    private List<T> books = new ArrayList<>();

    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }

    public void add(T item) {
        books.add(item);
    }

    public static void main(String[] args) {
        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();

        albums.add(new Album("Harry Potter"));
        albums.add(new Album("Sleeping beauty"));
        albums.add(new Album("Winnie-the-Pooh"));
        albums.add(new Album("Winnie-the-Pooh-2"));

        storage.addAll(albums);

        Album album1 = new Album("1000 receipts");
        storage.add(album1);

        storage.print();
    }

    private void print() {
        for (Book currentBook : books) {
            System.out.println(currentBook.get());
        }
    }
}