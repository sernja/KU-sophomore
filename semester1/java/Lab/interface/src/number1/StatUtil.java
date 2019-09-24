package number1;

public class StatUtil {
    public static double max(Measurement[] measurements) {
        double result = 0;
        for (Measurement m : measurements) {
            if (m.getMeasurement() > result) {
                result = m.getMeasurement();
            }
        }
        return result;
    }
}
