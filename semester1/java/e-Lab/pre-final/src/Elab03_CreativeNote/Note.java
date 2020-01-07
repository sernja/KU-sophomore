package Elab03_CreativeNote;
//elab-source:Note.java
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Note {

    private String key;
    private int numOfKey;
    private int index;
    private String keys ;

    public Note(String key, int numOfKey) {
        this.keys = "CDEFGAB";
        for(int i=0;i<keys.length();i++){
            if(key.equals(String.valueOf(keys.charAt(i)))){
                this.index = i;
            }
        }
        this.key = key;
        this.numOfKey = numOfKey;
    }

    public void setKey(){
        this.index += 1;
        this.index = this.index%7;
        this.key = String.valueOf(keys.charAt(index));
    }

    public String getKey() {
        String result ="";
        for(int i=0;i<numOfKey;i++){
            result+= key;
        }
        return result;
    }

}
