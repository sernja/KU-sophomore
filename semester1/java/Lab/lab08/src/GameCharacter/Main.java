package GameCharacter;

public class Main {
    public static void fighting(GameCharacter pAtk, GameCharacter pDef){
        if(pAtk.getWeapon().getDurability() != 0){
            pAtk.attack(pDef);
            System.out.println("player are ATK name : " + pDef.getName() + " HP : " + pDef.getHp());
        } else System.out.println("player " + pDef.getName() + "is dead");
    }
    public static void fighting(GameCharacter pAtk, GameCharacter pDef, Gun gun){
        if (gun.getNumAmmo() != 0) {
            if (pAtk.getWeapon().getDurability() != 0) {
                pAtk.attack(pDef);
                System.out.println("player are ATK name : " + pDef.getName() + " HP : " + pDef.getHp());
            } else System.out.println("player " + pDef.getName() + "is dead");
        }
    }

    public static void main(String[] args) {
        GameCharacter slime = new GameCharacter("Slime", 100, 40, new Weapon(0, 0));

        Weapon stick = new Weapon(3, 30);
        GameCharacter player = new GameCharacter("Inorin", 100, 20, stick);

        Gun rpg = new Gun(1200, 1, 1, 60);
        GameCharacter leon = new GameCharacter("Leon", 340, 44, rpg);

        Weapon a = new Gun(1000, 1, 1, 50);
        GameCharacter dorla = new GameCharacter("Dorla", 300, 10, a);

        fighting(player, slime);
        fighting(leon, dorla, rpg);
    }
}
