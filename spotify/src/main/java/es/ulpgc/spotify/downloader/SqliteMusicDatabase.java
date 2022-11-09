package es.ulpgc.spotify.downloader;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class SqliteMusicDatabase implements MusicDatabase {
    private final Connection connection;
    public  SqliteMusicDatabase() throws SQLException{
        connection= DriverManager.getConnection("jdbc:sqlite:tracks.db");
        initDatabase();
    }
    private static final String INIT1= "CREATE IF NOT EXISTS artists (" +
                                        "name varchar(50)," +
                                        "href varchar(100)," +
                                        "id varchar(100)," +
                                        "type varchar(50)," +
                                        "uri varchar(100),";
    private static final String INIT2= "CREATE IF NOT EXISTS tracks (" +
                                        "name varchar(50)," +
                                        "href varchar(100)," +
                                        "id varchar(100)," +
                                        "popularity INTEGER," +
                                        "uri varchar(100)";

    private static final String INIT3= "CREATE IF NOT EXISTS albums (" +
                                        "name varchar(50)," +
                                        "href varchar(100)," +
                                        "id varchar(100)," +
                                        "type varchar(50)," +
                                        "uri varchar(100)," +
                                        "totalTracks INTEGER," +
                                        "releaseDate varchar(50)";
    private static final String ADD_ALBUM= "INSERT INTO albums(name,href,id,type,uri,totalTracks,releaseDate) VALUES(%s,%s,%s,%s,%s,%d,%s)";
    private static final String ADD_TRACK="INSERT INTO tracks(name,href,id,popularity,uri) VALUES(%s,%s,%s,%d,%s)";
    private static final String ADD_ARTIST="INSERT INTO artists(name,href,id,type,uri) VALUES(%s,%s,%s,%s,%s)";
    private void initDatabase() throws SQLException{
        connection.createStatement().execute(INIT1);
        connection.createStatement().execute(INIT2);
        connection.createStatement().execute(INIT3);
    }
    @Override
    public void addTrack(Track track) throws SQLException {
        connection.createStatement().execute(String.format(ADD_TRACK, track.getName(), track.getHref(),track.getId(),
                track.getPopularity(),track.getUri()));
    }
    @Override
    public void addArtist(Artist artist) throws SQLException {
        connection.createStatement().execute(String.format(ADD_ARTIST, artist.getName(), artist.getHref(),artist.getId()
                ,artist.getType(),artist.getUri()));
    }
    @Override
    public void addAlbum(Album album) throws SQLException {
        connection.createStatement().execute(String.format(ADD_ALBUM, album.getName(), album.getHref(), album.getId(),
                album.getType(),album.getUri(),album.getTotalTracks(),album.getReleaseDate()));
    }
}
