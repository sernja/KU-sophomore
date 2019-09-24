package number3;

public class BankAccount implements Comparable<BankAccount>{
    private String name;
    private int money;
    public BankAccount(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }

    @Override
    public int compareTo(BankAccount b){
        if(this.money < b.money) return -1;
        if (this.money > b.money) return 1;
        return 0;
    }

}
