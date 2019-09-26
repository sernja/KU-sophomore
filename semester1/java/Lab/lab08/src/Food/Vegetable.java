package Food;

public class Vegetable implements Washable, Edible {

    @Override
    public void wash() {
        // wash my leaves
    }
    @Override
    public int giveEnergy() {
        double weight = 1;
        return (int)(0.5 * weight);
    }
}
