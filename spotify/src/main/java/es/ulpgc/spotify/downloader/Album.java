package es.ulpgc.spotify.downloader;

public class Album {
    private final String albumType;
    private final int totalTracks;
    private String[] availableMarkets;
    private ExternalUrl externalUrl;
    private final String href;
    private final String id;
    private Images[] images;
    private final String name;
    private final String releaseDate;
    private final String releaseDatePrecision;
    private final Restrictions restrictions;
    private final String type;
    private final String uri;
    private Artist[] artists;
    private Track[] tracks;


    public Album(String albumType, int totalTracks, String[] availableMarkets, ExternalUrl externalUrl, String href,
                 String id, Images[] images, String name, String releaseDate, String releaseDatePrecision,
                 Restrictions restrictions, String type, String uri, Artist[] artists, Track[] tracks) {
        this.albumType = albumType;
        this.totalTracks = totalTracks;
        this.availableMarkets = availableMarkets;
        this.externalUrl = externalUrl;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.releaseDate = releaseDate;
        this.releaseDatePrecision = releaseDatePrecision;
        this.restrictions = restrictions;
        this.type = type;
        this.uri = uri;
        this.artists = artists;
        this.tracks = tracks;
    }

    public String getName(){
        return this.name;
    }
    public String getHref(){
        return this.href;
    }
    public String getId(){
        return this.id;
    }
    public String getType(){
        return this.type;
    }
    public String getUri(){
        return this.uri;
    }
    public int getTotalTracks(){
        return this.totalTracks;
    }
    public String getReleaseDate(){
        return this.releaseDate;
    }
    public Artist[] getArtists(){
        return this.artists;
    }
    public Track[] getTracks(){
        return this.tracks;
    }
}
