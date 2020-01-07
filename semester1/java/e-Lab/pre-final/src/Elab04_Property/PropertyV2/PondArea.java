package Elab04_Property.PropertyV2;
//elab-source:PondArea.java
public class PondArea implements Areable {

    private double radius;

    public PondArea(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }
}
