package blog.models;

public class Post {
    private int id;
    private String text;

    public Post() {

    }

    public Post(int id, String text){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
