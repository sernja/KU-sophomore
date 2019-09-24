package GameCharacter;

public class Main {
    public static void fighting(GameCharacter pAtk, GameCharacter pDef){
        if(pAtk.getWeapon().getDurability() != 0){
            pAtk.attack(pDef);
        }
    }

    public static void main(String[] args) {
        GameCharacter slime = new GameCharacter("Slime", 100, 40, new Weapon(0, 0));
        Weapon stick = new Weapon(3, 30);
        GameCharacter player = new GameCharacter("Inorin", 100, 20, stick);

        Gun rpg = new Gun(1200, 1, 1, 60);
        GameCharacter leon = new GameCharacter("Leon", 340, 44, rpg);

//        Weapon a = new Gun();
        fighting(player, slime);
    }
}
