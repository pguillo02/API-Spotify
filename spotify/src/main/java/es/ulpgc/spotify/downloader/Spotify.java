package es.ulpgc.spotify.downloader;

import com.google.gson.Gson;

import java.util.Map;

public class Spotify implements MusicSource {
    SpotifyAccessor accessor= new SpotifyAccessor();
    public Spotify() throws Exception {}

    @Override
    public Artist extractArtist(String path) {
        try {
            String json= accessor.get(path, Map.of());
            Gson gson= new Gson();
            Artist artist=gson.fromJson(json,Artist.class);
            return artist;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Track extractTrack(String path) {
        try {
            SpotifyAccessor accessor= new SpotifyAccessor();
            String json= accessor.get(path, Map.of());
            Gson gson= new Gson();
            Track track=gson.fromJson(json,Track.class);
            return track;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Album extractAlbum(String path) {
        try {
            SpotifyAccessor accessor= new SpotifyAccessor();
            String json= accessor.get(path, Map.of());
            Gson gson= new Gson();
            Album album=gson.fromJson(json,Album.class);
            return album;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

