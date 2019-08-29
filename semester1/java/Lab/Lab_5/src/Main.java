public class Main {
    public static void main(String[] args) {
        FoodCard foodCard = new FoodCard();
        GreenCard greenCard = new GreenCard();
        BlueCard blueCard = new BlueCard();

        foodCard.topUp(200);
        foodCard.spend(50);
        System.out.println("GreyCard balance = " + foodCard.getBalance());

        greenCard.topUp(200);
        greenCard.spend(50);
        System.out.println("GreenCard balance = " + greenCard.getBalance());

        blueCard.topUp(200);
        blueCard.spend(50);
        blueCard.usePoint(9);
        System.out.println("BlueCard balance = " + blueCard.getBalance());
        System.out.println("BlueCard point = " + blueCard.getPoint());
    }
}
