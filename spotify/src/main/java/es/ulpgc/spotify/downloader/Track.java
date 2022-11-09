package es.ulpgc.spotify.downloader;

import spark.Request;
import spark.Response;

import static spark.Spark.halt;

public class Track {
    private final Album album;
    private final Artist[] artists;
    private String[] availableMarkets;
    private final int discNumber;
    private int durationMs;
    private boolean explicit;
    private ExternalIds externalIds;
    private ExternalUrl externalUrl;
    private final String href;
    private final String id;
    private boolean isPlayable;
    private LinkedFrom linkedFrom;
    private Restrictions restrictions;
    private final String name;
    private int popularity;
    private String previewUrl;
    private int trackNumber;
    private String type;
    private String uri;
    private boolean isLocal;

    public Track(Album album, Artist[] artists, String[] availableMarkets, int discNumber, int durationMs,
                 boolean explicit, ExternalIds externalIds, ExternalUrl externalUrl, String href, String id,
                 boolean isPlayable, LinkedFrom linkedFrom, Restrictions restrictions, String name, int popularity,
                 String previewUrl, int trackNumber, String type, String uri, boolean isLocal) {
        this.album = album;
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalIds = externalIds;
        this.externalUrl = externalUrl;
        this.href = href;
        this.id = id;
        this.isPlayable = isPlayable;
        this.linkedFrom = linkedFrom;
        this.restrictions = restrictions;
        this.name = name;
        this.popularity = popularity;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
        this.isLocal = isLocal;
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

    public int getPopularity(){
        return this.popularity;
    }

    public String getUri(){
        return this.uri;
    }

    public Album getAlbum(){
        return this.album;
    }

    public Artist[] getArtists(){
        return this.artists;
    }
}
