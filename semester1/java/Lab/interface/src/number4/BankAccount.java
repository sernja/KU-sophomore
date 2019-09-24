package number4;

public class BankAccount {
    private String name;
    private double money;

    public BankAccount(String n, double m){
        name = n;
        money = m;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
