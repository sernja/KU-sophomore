package number1;

public class Product implements  Measurement{
    private String name;
    private double price;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public double getMeasurement(){
        return price;
    }
}
