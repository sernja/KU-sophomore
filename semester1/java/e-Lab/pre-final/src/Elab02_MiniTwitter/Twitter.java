package Elab02_MiniTwitter;

//elab-source:Twitter.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Twitter {
    private Map<String ,Account> accounts;
    private ArrayList<String> allAccounts;

    public Twitter() {
        this.accounts = new TreeMap<>();
        this.allAccounts = new ArrayList<>();
    }

    public void addToTwitter(Account account){

        this.accounts.put(account.getName(),account);
        this.allAccounts.add(account.getName());
    }

    public void addFollower(String accountMain , String following){
        if(accounts.containsKey(accountMain)){
            accounts.get(accountMain).followed(following);
        }
    }

    public void checkAndAdd(String data){
        String[] dataSplit = data.split("/");
        if(accounts.containsKey(dataSplit[0])){
            accounts.get(dataSplit[0]).addPost("("+dataSplit[0]+") "+dataSplit[1]);
        }
        for(String key:accounts.keySet()){
            if(accounts.get(key).getFollowing().containsKey(dataSplit[0])){
                accounts.get(key).addPost("("+dataSplit[0]+") "+dataSplit[1]);
            }
        }
    }


    public void print(){
        for(String key:allAccounts){
            System.out.println(key+":");
            for(int i=0;i<accounts.get(key).getNewsFeed().size();i++){
//                System.out.println();
                System.out.println(accounts.get(key).getNewsFeed().get(i));
            }
        }
    }
}
