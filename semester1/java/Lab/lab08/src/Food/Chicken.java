package Food;

public class Chicken implements Washable, Edible {

    @Override
    public void wash() {
        // wash my two legs
        // wash my head
        // wash my body
        // wash my tail
    }
    @Override
    public int giveEnergy() {
        double weight = 2;
        return (int)(4 * weight);
    }

}
