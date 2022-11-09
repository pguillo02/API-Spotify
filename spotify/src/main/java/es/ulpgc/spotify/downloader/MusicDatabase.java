package es.ulpgc.spotify.downloader;

import java.sql.SQLException;

public interface MusicDatabase {
    public void addTrack(Track track) throws SQLException;
    public void addArtist(Artist artist) throws SQLException;
    public void addAlbum(Album album) throws SQLException;

}
