package number4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Sern", 4),
                new Animal("Nob", 10),
                new Animal("Mix", 2)
        };

        Arrays.sort(animals, new AnimalAgeComparator());
        System.out.println("Animal");
        for (Animal animal : animals){
            System.out.println(animal.getName() + " " + animal.getAge());
        }

        BankAccount[] accounts = {
                new BankAccount("sern", 20),
                new BankAccount("Nob", 60000),
                new BankAccount("Mix", 10)
        };

        Arrays.sort(accounts, new BankAccountMoneyComparator());
        System.out.println("BankAccount");
        for (BankAccount account : accounts){
            System.out.println(account.getName() + " " + account.getMoney());
        }

    }
}
