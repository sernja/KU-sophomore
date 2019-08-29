public class BlueCard extends FoodCard{
    private int point;
    public BlueCard(){
        super();
        this.point = 0;
    }

    public void topUp(double money){
        if(money >= 200) {
            point += ((int) (money / 200)) * 10;
        }
        super.topUp(money);
    }

    public void spend(double purchase){
        super.spend(purchase);
        point += ((int) (purchase / 50)) * 2;
    }

    public void usePoint(int point) {
        if (point > this.point){
            System.out.println("point is insufficient");
            this.point -= point;
        } else {
            this.point -= point;
        }
    }

    public int getPoint() {
        return point;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
