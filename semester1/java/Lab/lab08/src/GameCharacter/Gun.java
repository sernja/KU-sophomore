package GameCharacter;

public class Gun extends Weapon{
    private int numAmmo;
    private double accuracy;
    public Gun(int dmg, int dur, int ammo, double acc) {
        super(dmg, dur);
        numAmmo = ammo;
        accuracy = acc;
    }

    public double getAccuracy() {
        return accuracy;
    }
    public int getNumAmmo() {
        return numAmmo;
    }

    @Override
    public void use() {
        super.use();
        if (--numAmmo < 0) numAmmo = 0;
    }
}
