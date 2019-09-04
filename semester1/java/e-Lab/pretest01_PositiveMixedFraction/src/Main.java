public class Main {
    public static void main(String[] args) {
        PositiveMixedFraction p1 = new PositiveMixedFraction(1, 18, 9);
        PositiveMixedFraction p2 = new PositiveMixedFraction(1, 8, 9);
        System.out.println("w = " + p1.getWholeNumber() + " n = " + p1.getNominator() + " d = " + p1.getDenominator());
        System.out.println("w = " + p2.getWholeNumber() + " n = " + p2.getNominator() + " d = " + p2.getDenominator());
    }
}
