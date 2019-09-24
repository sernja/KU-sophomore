package number4;

import java.util.Comparator;

public class BankAccountMoneyComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if (o1.getMoney() < o2.getMoney()) return -1;
        if (o1.getMoney() > o2.getMoney()) return 1;
        return 0;
    }
}
