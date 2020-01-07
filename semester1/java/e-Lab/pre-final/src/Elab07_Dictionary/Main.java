package Elab07_Dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add(new Vocabulary("home", "noun",
                "the place where one lives permanently,especially as a member of a family orhousehold."));
        System.out.println("size : " + dictionary.getSize());
        System.out.println(dictionary.search("home"));
        System.out.println(dictionary.search("house"));
        dictionary.add(new Vocabulary("house",
                "noun","a building for human habitation,especially one that is lived in by a family orsmall group of people."));
        System.out.println("size : "+ dictionary.getSize());
        System.out.println(dictionary.search("house"));
    }
}
