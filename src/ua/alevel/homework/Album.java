package ua.alevel.homework;


public class Album extends Book {
    private String album;

    public Album() {
    }

    public Album(String album) {
        this.album = album;
    }

    public String get() {
        return album;
    }

    public void set(String album) {
        this.album = album;
    }

}
