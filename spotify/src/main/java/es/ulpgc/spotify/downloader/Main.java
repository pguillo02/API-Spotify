package es.ulpgc.spotify.downloader;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception {
        MusicSource source = new Spotify();
        MusicDatabase musicDatabase= new SqliteMusicDatabase();

        List<Track> tracks= new ArrayList<>();
        List<Artist> artists= new ArrayList<>();
        List<Album> albums= new ArrayList<>();

        artists.add(source.extractArtist("/artist/6eUKZXaKkcviH0Ku9w2n3V"));
        artists.add(source.extractArtist("/artist/711MCceyCBcFnzjGY4Q7Un"));
        artists.add(source.extractArtist("/artist/1wGIhYkKWSq4yACtTkCkSX"));
        artists.add(source.extractArtist("/artist/7oPftvlwr6VrsViSDV7fJY"));
        artists.add(source.extractArtist("/artist/7ceUfdWq2t5nbatS6ollHh"));

        updateDB(musicDatabase, tracks, artists, albums);
    }

    public  static void updateDB(MusicDatabase musicDatabase, List<Track> tracks, List<Artist> artists,
                                                         List<Album> albums) throws SQLException {
        for (Track track: tracks){
            albums.add(track.getAlbum());
            for (Artist artist: track.getArtists()){
                artists.add(artist);
            }
            musicDatabase.addTrack(track);
        }

        for (Album album: albums){
            for(Artist artist:album.getArtists()){
                artists.add(artist);
            }
            for (Track track:album.getTracks()){
                tracks.add(track);
            }
            musicDatabase.addAlbum(album);
        }

        for (Artist artist: artists){
            musicDatabase.addArtist(artist);
        }
    }
}