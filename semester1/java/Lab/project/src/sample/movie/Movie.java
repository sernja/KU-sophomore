package sample.movie;

public class Movie {
    private String name;
    private String date;
    private String type;
    private String time;
    private String image;

    public Movie(String name, String date, String type, String time) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public String getType() {
        return type;
    }
    public String getTime() {
        return time;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
