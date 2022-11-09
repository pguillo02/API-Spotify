package es.ulpgc.spotify.downloader;

public class Artist {
    private ExternalUrl externalUrl;
    private Followers followers;
    private String[] genres;
    private String href;
    private String id;
    private Images[] images;
    private final String name;
    private int popularity;
    private final String type;
    private final String uri;

    public Artist (ExternalUrl externalUrl, Followers followers, String[] genres, String href,
                   String id, Images[] images, String name, int popularity, String type, String uri){
        this.externalUrl = externalUrl;
        this.followers = followers;
        this.genres = genres;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.popularity = popularity;
        this.type = type;
        this.uri = uri;
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
}
