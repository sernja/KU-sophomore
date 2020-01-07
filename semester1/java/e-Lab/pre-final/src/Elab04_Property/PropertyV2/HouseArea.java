package Elab04_Property.PropertyV2;
//elab-source:HouseArea.java
public class HouseArea implements Areable{

    private double areaWithMeter;

    public HouseArea(double areaWithMeter){
        this.areaWithMeter = areaWithMeter;
    }

    @Override
    public double getArea() {
        return areaWithMeter*4;
    }
}
