package Elab04_Property.PropertyV2;
//elab-source:BuildingArea.java
public class BuildingArea implements  Areable {

    private double width;
    private double heihjt;
    private int level;

    public BuildingArea(double width, double heihjt, int level) {
        this.width = width;
        this.heihjt = heihjt;
        this.level = level;
    }

    @Override
    public double getArea() {
        return width*heihjt*level;
    }

}
