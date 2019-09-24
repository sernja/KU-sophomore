package number3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BankAccount[] bankAccounts = {new BankAccount("A", 10), new BankAccount("B", 20)};
        Animal[] animals = {new Animal("A", 1), new Animal("b", 99)};

        Arrays.sort(BankAccount);

        for (BankAccount b : bankAccounts){
            System.out.println(b.getName()+b.getMoney());
        }

        Arrays.sort(Animal);
        for (Animal a : animals){
            System.out.println(a.getName()+a.getYears());
        }
        System.out.println();
    }
}
