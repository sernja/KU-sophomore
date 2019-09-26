package Food;

public class Dog implements Washable {
    private int hp;

    @Override
    public void wash() {
        // wash my four legs
        // wash my head
        // wash my body
        // wash my tail
    }

    public int getHp() {
        return hp;
    }

    public void eat(Edible food) {
        hp += food.giveEnergy();
    }
}
