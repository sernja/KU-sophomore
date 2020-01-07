package Elab07_Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String , Vocabulary > dictionary;

    public Dictionary() {
       dictionary = new HashMap<>();
    }

    public void add(Vocabulary vocab){
        dictionary.put(vocab.getName(),vocab);
    }

    public String search(String vocab){
        boolean canFind = false;
        for(String key:dictionary.keySet()){
            if(key.equals(vocab))
                canFind = true;
        }
        if(canFind)
            return dictionary.get(vocab).toString();
        return "Not found "+"\""+vocab +"\""+" in Dictionary.";
    }

    public int getSize(){
        return dictionary.size();
    }
}
