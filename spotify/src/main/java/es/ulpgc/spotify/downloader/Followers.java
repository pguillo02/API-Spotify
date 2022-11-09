package es.ulpgc.spotify.downloader;

public class Followers {
    private final String href;
    private int total;

    public Followers(String href, int total) {
        this.href = href;
        this.total = total;
    }
}
