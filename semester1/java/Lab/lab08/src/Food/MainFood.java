package Food;

public class MainFood {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Chicken kfc = new Chicken();
        dog.eat(kfc);

        Vegetable lettuce = new Vegetable();
        dog.eat(lettuce);

        System.out.println("Dog HP = " + dog.getHp());
    }
}
