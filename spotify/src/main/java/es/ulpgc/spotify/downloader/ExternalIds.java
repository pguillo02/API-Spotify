package es.ulpgc.spotify.downloader;

public class ExternalIds {
    private final String isrc;
    private String ean;
    private String upc;

    public ExternalIds(String isrc, String ean, String upc) {
        this.isrc = isrc;
        this.ean = ean;
        this.upc = upc;
    }
}
