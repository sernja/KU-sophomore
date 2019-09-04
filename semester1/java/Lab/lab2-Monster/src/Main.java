import java.util.Scanner;

public class Main {
    public static Monster createMT() {
        int hp, atk, def;
        String name;
        while (true) {
            Scanner inPut = new Scanner(System.in);
            name = inPut.next();
            hp = inPut.nextInt();
            atk = inPut.nextInt();
            def = inPut.nextInt();
            if (hp < 0 || atk < 0 || def < 0) {
                System.out.println("Input error please try again.");
            } else break;
        }
        return new Monster(name, hp, atk, def);
    }

    public static void fight(Monster m1, Monster m2) {
        System.out.println("Please enter skill A=attack H=heal");
        Scanner skill = new Scanner(System.in);
        String sskill = skill.nextLine();
        if(sskill.equals("a") || sskill.equals("A")) m2.hurt(m1);
        else if (sskill.equals("h") || sskill.equals("H")){
            System.out.println("Please enter recovery hp : ");
            Scanner hl = new Scanner(System.in);
            int heal = hl.nextInt();
            m1.Heal(heal);
        }
    }

    public static void main(String[] arg) {
        System.out.println("!!!  Monster Fight  !!!");
        System.out.println("Please input monster1 name hp atk def :");
        Monster m1 = createMT();
        System.out.println("Please input monster2 name hp atk def :");
        Monster m2 = createMT();
        int i = 0;
        while(true) {
            i++;
            if (m1.getHp() > 0 && m2.getHp() > 0) {
                System.out.println("\nRound : " + i);
                if(m1.getHp() > 0) {
                    System.out.println(">>> Monster 1 turn <<<");
                    if(m1.getBool_heal()) {
                        fight(m1, m2);
                        System.out.println(m1.info());
                        System.out.println(m2.info());
                    }else {
                        System.out.println("Monster 1 Can't use skill");
                        m1.reco_bool_heal();
                    }
                }if(m2.getHp() > 0) {
                    System.out.println(">>> Monster 2 turn <<<");
                    if(m2.getBool_heal()) {
                        fight(m2, m1);
                        System.out.println(m1.info());
                        System.out.println(m2.info());
                    }else {
                        System.out.println("Monster 2 Can't use skill");
                        m2.reco_bool_heal();
                    }
                }
            }else{
                System.out.println("\nThe Winner Is ..........");
                if(m1.getHp() > 0) System.out.println(m1.info());
                else System.out.println(m2.info());
                break;
            }
        }
    }
}
