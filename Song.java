import java.net.URL;

public class Song {
    private String name;
    private URL url;
    public Song(String name, URL url){
        this.url = url;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public URL getUrl(){
        return url;
    }

}
