package es.ulpgc.spotify.downloader;

public class LinkedFrom {
    private final Album album;
    private final Artist[] artists;
    private String[] availableMarkets;
    private int discNumber;
    private final int durationMs;
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
    private final String previewUrl;
    private final int trackNumber;
    private String type;
    private final String uri;
    private boolean isLocal;

    public LinkedFrom(Album album, Artist[] artists, String[] availableMarkets, int discNumber, int durationMs,
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
}
