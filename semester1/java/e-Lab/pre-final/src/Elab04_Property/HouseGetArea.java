package Elab04_Property;

public class HouseGetArea implements getAreable {
    private double area;

    public HouseGetArea(double area) {
        this.area = area;
    }
    @Override
    public double getArea() {
        return area*4;
    }
}
