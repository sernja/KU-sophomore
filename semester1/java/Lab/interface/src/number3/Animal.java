package number3;

public class Animal implements Comparable<Animal>{
    private String name;
    private int years;

    public Animal(String name, int years){
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }
    public int getYears() {
        return years;
    }

    @Override
    public int compareTo(Animal other){
        if (this.years < other.years) return -1;
        else if(this.years > other.years) return 1;
        else return 0;
    }
}
