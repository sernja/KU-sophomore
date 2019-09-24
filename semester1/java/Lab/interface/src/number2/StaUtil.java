package number2;


public class StaUtil {
    public static double max(Product[] measurements) {
        double result = 0;
        for (Product m : measurements) {
            if (m.getPrice() > result) {
                result = m.getPrice();
            }
        }
        return result;
    }
    public static double max(Car[] measurements) {
        double result = 0;
        for (Car m : measurements) {
            if (m.getKiloDrive() > result) {
                result = m.getKiloDrive();
            }
        }
        return result;
    }
}
