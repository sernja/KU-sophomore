package Elab04_Property;

public class BuidingGetArea implements getAreable{
    private double width;
    private double height;
    private int level;

    public BuidingGetArea(double width, double height, int level) {
        this.width = width;
        this.height = height;
        this.level = level;
    }

    @Override
    public double getArea() {
        return width*height*level;
    }
}
