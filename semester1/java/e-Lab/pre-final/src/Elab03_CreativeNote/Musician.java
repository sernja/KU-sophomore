package Elab03_CreativeNote;
//elab-source:Musician.java
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Musician {
    private ArrayList<Note> music;
    private Map<Integer,String> creativeKeys;


    public Musician(){
        this.music = new ArrayList<>();
        this.creativeKeys = new TreeMap<>();
    }

    public void addKey(String command , Note note , int n){
        if(command.equals("Creative")){
            this.music.add(note);
            creativeKeys.put(n,null);
        }else if(command.equals("Normal")){
            this.music.add(note);
        }
    }

    public void changeMusic(){
        for(int i=0;i<music.size();i++){
            if(creativeKeys.containsKey(i)){
                music.get(i).setKey();
            }
        }
    }

    public void print(){
        for(Integer key:creativeKeys.keySet()){
            System.out.print(key+" ");
        }
    }

    public void play(){
        for(Note note:music){
            System.out.print(note.getKey());
        }
    }
}
