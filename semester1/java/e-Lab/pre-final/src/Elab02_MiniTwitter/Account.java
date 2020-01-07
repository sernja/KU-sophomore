package Elab02_MiniTwitter;

//elab-source:Account.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Account {
    private String name;
    private Map<String, String> following;
    private ArrayList<String> newsFeed;

    public Account(String name) {
        this.name = name;
        this.newsFeed = new ArrayList<>();
        this.following = new HashMap<>();
    }

    public void followed(String name) {
        following.put(name, null);
    }

    public void addPost(String status) {
        this.newsFeed.add(status);
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getFollowing() {
        return following;
    }

    public ArrayList<String> getNewsFeed() {
        return newsFeed;
    }
}
