public class FoodCard {
    private double balance;
    public FoodCard(){
        this.balance = 0;
    }
    public void topUp(double money){
        if (money < 0)
            throw new IllegalArgumentException("money must be positive");
        balance += money;
    }
    public void spend(double purchase){
        if (purchase > balance)
            throw new IllegalArgumentException("balance is insufficient");
        this.balance -= purchase;
    }

    public double getBalance() {
        return balance;
    }
}
