package es.ulpgc.spotify.downloader;

public interface MusicSource {
    public Artist extractArtist(String path);
    public Track extractTrack(String path);
    public Album extractAlbum(String path);
}
