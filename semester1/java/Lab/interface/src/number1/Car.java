package number1;

public class Car implements Measurement{
    private System license;
    private double kiloDrive; //ระนะทาางขับ

    public System getLicense() {
        return license;
    }
    public double getKiloDrive() {
        return kiloDrive;
    }

    @Override
    public double getMeasurement(){
        return kiloDrive;
    }
}
