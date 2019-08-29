public class GreenCard extends FoodCard{
    public GreenCard(){
        super();
    }

    public void topUp(double money){
        if(money >= 200){
            super.topUp ((int) (money / 200) * 10);
        }
        super.topUp(money);
    }
    public void spend(double purchase){
        super.spend(purchase);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
